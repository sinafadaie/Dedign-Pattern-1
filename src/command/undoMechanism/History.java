package command.undoMechanism;

import java.util.ArrayList;
import java.util.List;

//we can develop many undoable commands
//we want to keep history of them ordinary
//instead of snapshot entire obj
//keep history of commands
//each commands can undo itself one step
//(if we want to undo multiple step
// we should develop History for each Command)

public class History {
    private List<UndoableCommand> commands = new ArrayList<>();

    public void push(UndoableCommand command){
        commands.add(command);
    }

    public UndoableCommand pop(){
        UndoableCommand last = commands.getLast();
        commands.removeLast();
        return last;
    }
}
