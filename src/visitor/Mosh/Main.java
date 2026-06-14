package visitor.Mosh;


public class Main {
    public static void main(String[] args){
        HtmlDocument document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        HighlightOperation highlightOperation = new HighlightOperation();
        document.execute(highlightOperation);

        PlainTextOperation plainTextOperation = new PlainTextOperation();   //we just add new operation
        document.execute(plainTextOperation);                               //by create a new class (PlainTextOperation class)
    }
}
