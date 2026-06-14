package mediator.Mosh;

import mediator.*;

public class ArticleDialogBox extends DialogBox {
    private ListBox articlesListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInterface(){
        articlesListBox.setSelection("Article 1");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnables());
    }

    @Override
    public void change(UIControl control) {

        if (control == articlesListBox){
            articleSelected();
        } else if (control == titleTextBox) {
            titleChanged();
        }
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
