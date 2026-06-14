package command.undoMechanism;

public class UndoCommand implements Command{
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {                         //we can add an if
        UndoableCommand command = history.pop();    //to check history is not empty
        command.unExecute();
    }
}
