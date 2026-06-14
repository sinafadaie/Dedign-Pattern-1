package mediator;

public class ListBox extends UIControl{
    private String selection;   //it's store selected item on the list

    public ListBox(DialogBox owner) {   //because ListBox extends to UIControl
        super(owner);                   //and UIControl hasn't default constructor
    }                                   //we need to initiate the parent part

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.change(this);     //so if the selection will change
    }
}
