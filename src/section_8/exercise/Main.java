package section_8.exercise;

public class Main {
    public static void main(String[] args){
        VideoEditor videoEditor = new VideoEditor();
        TextCommand textCommand = new TextCommand(videoEditor);
        ContrastCommand contrastCommand = new ContrastCommand(videoEditor);

        textCommand.operate("birthDate");
        contrastCommand.operate("4");

        System.out.println(videoEditor);
    }
}
