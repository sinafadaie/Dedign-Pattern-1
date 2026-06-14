package visitor.Mosh;


public class HeadingNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {  //polymorphism on Operation

        operation.apply(this);  //by "this" we choose correct overload
    }
}
