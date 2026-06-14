package memento.Cenna;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");

        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
    }
}