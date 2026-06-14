package command.compositeCommand;

import command.compositeCommand.fx.Button;

public class Main {
    public static void main(String[] args){




        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new BlackAndWhiteCommand());
        compositeCommand.add(new ResizeCommand());

        Button compositButton = new Button(compositeCommand);
        compositButton.click();
    }
}
