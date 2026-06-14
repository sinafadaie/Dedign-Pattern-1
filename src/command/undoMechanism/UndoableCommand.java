package command.undoMechanism;

public interface UndoableCommand extends Command {
    void unExecute();
}
