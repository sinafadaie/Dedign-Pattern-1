package memento.excersize;

public class Document {
    private final History history;
    private String content;
    private String fontName;
    private int fontSize;

    public Document(History history) {
        this.history = history;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    public void undo(){
        Memento memento = history.pop();

        fontSize = memento.getFontSize();
        fontName = memento.getFontName();
        content = memento.getContent();
    }
}
