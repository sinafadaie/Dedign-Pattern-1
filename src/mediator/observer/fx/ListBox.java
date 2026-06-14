package mediator.observer.fx;

public class ListBox extends UIControl {
    private String selection;   //it's store selected item on the list

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyObserver();
    }
}
