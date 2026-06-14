package command.undoMechanism;

public class BoldCommand implements UndoableCommand{

    private String prevContent;
    private HtmlEditor htmlEditor;
    private History history;

    public BoldCommand(HtmlEditor htmlEditor, History history) {
        this.htmlEditor = htmlEditor;
        this.history = history;
    }

    @Override
    public void unExecute() {
        htmlEditor.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = htmlEditor.getContent();
        htmlEditor.makeBold();
        history.push(this);     //we can have multiple commands
                                          //we want to remember we have used which commands
    }
}
