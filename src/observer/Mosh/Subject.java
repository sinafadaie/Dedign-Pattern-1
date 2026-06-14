package observer.Mosh;

import java.util.ArrayList;
import java.util.List;

//some people use "Observable" name instead Subject
//it's an obj that we can observe

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){     //like addObj() on Cenna
        observers.add(observer);
    }

    public  void removeObserver(Observer observer){ //I did not implement
        observers.remove(observer);
    }

    //I used this loop directly on setter

    //-----------push style
    /*public void notifyObserver(int value){
        for(var observer : observers){
            observer.update(value);
        }
    }*/

    public void notifyObserver(){
        for(var observer : observers){
            observer.update();
        }
    }
}
