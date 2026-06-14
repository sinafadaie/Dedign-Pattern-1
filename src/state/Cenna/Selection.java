package state.Cenna;

public class Selection extends Tool{

    @Override
    public void toolIcon() {
        System.out.println("selection icon");
    }

    @Override
    public void toolAction() {
        System.out.println("draw dashed rectangle");
    }
}
