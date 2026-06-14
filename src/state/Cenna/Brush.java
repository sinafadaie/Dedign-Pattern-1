package state.Cenna;

public class Brush extends Tool{
    @Override
    public void toolIcon() {
        System.out.println("brush icon");
    }

    @Override
    public void toolAction() {
        System.out.println("draw a line");
    }
}
