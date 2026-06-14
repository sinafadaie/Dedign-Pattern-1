package mediator.observer.fx;

import java.util.ArrayList;
import java.util.List;

//UI controller is our Subject
public abstract class UIControl  {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    };

    public void notifyObserver(){
        for(var observer : observers)
            observer.update();
    }
}
