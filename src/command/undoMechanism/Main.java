package command.undoMechanism;

public class Main {
    public static void main(String[] args){

        History history = new History();
        HtmlEditor htmlEditor = new HtmlEditor();

        htmlEditor.setContent("hello world");

        BoldCommand boldCommand = new BoldCommand(htmlEditor, history);     //somewhere in our UI, we have this button
        boldCommand.execute();
        System.out.println(htmlEditor.getContent());

        //boldCommand.unExecute();                                          //probably we have undo button on UI
        //System.out.println(htmlEditor.getContent());                      //so it is not nice call unexecute by boldCommand
                                                                            //we need separate command (separate button)

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(htmlEditor.getContent());                        //we can not undo just bolding!
                                                                            //if we use undo, he finds last action from history
                                                                            //then revert it!

    }
}
