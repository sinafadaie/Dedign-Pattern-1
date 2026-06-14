package mediator;

public class TextBox extends UIControl{
    String content;

    public TextBox(DialogBox owner) {
        super(owner);
    }

    public void setContent(String content) {
        this.content = content;
        owner.change(this);
    }

    public String getContent() {
        return content;
    }



}
