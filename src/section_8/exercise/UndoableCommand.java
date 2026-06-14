package section_8.exercise;

public interface UndoableCommand extends Command{
    void unExecute();
}
