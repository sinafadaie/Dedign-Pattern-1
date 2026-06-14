package observer.Mosh;

public class DataSource extends Subject{
    private int value;

    public void setValue(int value) {

        this.value = value;
        //notifyObserver(value);    //push style
        notifyObserver();           //pull style
    }

    public int getValue() {
        return value;
    }

}
