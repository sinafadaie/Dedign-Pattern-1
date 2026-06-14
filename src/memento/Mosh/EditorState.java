package memento.Mosh;

//it's a Memento class
//his duty is snapshot!

public class EditorState {
    private final String content;     //make it final to guarantee it's CTE
                                      //it adds robustness to our code

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
