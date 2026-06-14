package mediator;

//here we haven't any implementation, so we can use Interface
//but in areal GUI framework, this dialog box is going to
//provide some common behavior to all dialog box (have to be abstract class)

public abstract class DialogBox {
    public abstract void change(UIControl uiControl);
}
