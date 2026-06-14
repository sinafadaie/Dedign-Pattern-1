package section_8.exercise;

public class TextCommand implements Command{

    private VideoEditor videoEditor;

    public TextCommand(VideoEditor videoEditor) {
        this.videoEditor = videoEditor;
    }

    @Override
    public void operate(String text) {
     videoEditor.setText(text);
    }
}
