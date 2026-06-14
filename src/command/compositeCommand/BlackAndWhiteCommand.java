package command.compositeCommand;

import command.compositeCommand.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("B&W filter");
    }
}
