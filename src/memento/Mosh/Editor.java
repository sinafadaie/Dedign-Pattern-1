package memento.Mosh;


public class Editor {
    private String content ;

    public String getContent() {
        return content;
    }

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore (EditorState editorState){
        content = editorState.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }


}
