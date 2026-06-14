package mediator.observer;


import mediator.observer.fx.*;
import mediator.observer.fx.Button;
import mediator.observer.fx.ListBox;
import mediator.observer.fx.TextBox;

public class ArticleDialogBox /*implements Observer*/ {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

   /*public ArticleDialogBox() {
        this.articlesListBox.attach(this);     //here is mediator
        this.titleTextBox.attach(this);        //so we need observed all source
        this.saveButton.attach(this);
    }*/


    public ArticleDialogBox(){
        articlesListBox.attach(()->articleSelected());      //make an event as observer!
        titleTextBox.attach(()->titleChanged());            //we have multiple source
    }                                                       //changing each of them, can execute different method

    public void simulateUserInterface(){
        articlesListBox.setSelection("Article 1");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnables());
    }


    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnables(true);    //to enable button
    }

    private void titleChanged(){
        String content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnables(!isEmpty);
    }

}
