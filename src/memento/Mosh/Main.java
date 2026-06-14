package memento.Mosh;


public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState()); //create snapshot
                                            //and push it to history

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");             //we don't save c to history!

        editor.restore(history.pop());
        System.out.println(editor.getContent());  //b

        editor.restore(history.pop());
        System.out.println(editor.getContent());  //a
    }
}