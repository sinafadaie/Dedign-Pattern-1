package visitor.Mosh;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlight-header");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlight-anchor");
    }
}
