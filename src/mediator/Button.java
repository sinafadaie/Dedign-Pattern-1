package mediator;

public class Button extends UIControl{
    private boolean isEnables;

    public Button(DialogBox owner) {
        super(owner);
    }

    public void setEnables(boolean enables) {
        isEnables = enables;
    }

    public boolean isEnables() {
        return isEnables;
    }
}
