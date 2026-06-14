package visitor;

//an anchor is hyperlink
public class AnchorNode implements HtmlNode{
    @Override
    public void highlight() {
        System.out.println("highlight-anchor");
    }
}
