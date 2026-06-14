package command.undoMechanism;


public class HtmlEditor {
    private String content;

    public void makeBold(){     //it's where actual code is
                                //it's like our service
        content = "<b>" + content + "<b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
