package mediator.observer.fx;



public class Button extends UIControl {
    private boolean isEnables;


    public void setEnables(boolean enables) {
        isEnables = enables;
        notifyObserver();       //we set our mediator class (DialogBox)
                                //as observer, so he finds out the button has some change
    }

    public boolean isEnables() {
        return isEnables;
    }
}
