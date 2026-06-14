package section_8.exercise;

import command.undoMechanism.History;
import command.undoMechanism.UndoableCommand;

public class ContrastCommand implements UndoableCommand {
    private VideoEditor videoEditor;
    private Float preContrast;
    private Float contrast;
    private TextCommandHistory history;

    public ContrastCommand(Float contrast, VideoEditor videoEditor, TextCommandHistory history) {
        this.videoEditor = videoEditor;
        preContrast = videoEditor.getContrast();
        this.contrast = contrast;
        this.history = history;
    }

    @Override
    public void execute() {
        videoEditor.setContrast(contrast);
        history.
    }

    @Override
    public void unExecute() {

    }
}
