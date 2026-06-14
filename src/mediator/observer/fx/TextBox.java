package mediator.observer.fx;


public class TextBox extends UIControl {
    String content;


    public void setContent(String content) {
        this.content = content;
        notifyObserver();
    }

    public String getContent() {
        return content;
    }



}
