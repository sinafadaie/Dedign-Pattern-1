package memento.excersize;

public class Memento {
    private String content;
    private String fontName;
    private int fontSize;


    public Memento(Document document) {
        this.content = document.getContent();
        this.fontName = document.getFontName();
        this.fontSize = document.getFontSize();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
