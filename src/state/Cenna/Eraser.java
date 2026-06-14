package state.Cenna;

public class Eraser extends Tool {
    @Override
    public void toolIcon() {
        System.out.println("eraser icon");
    }

    @Override
    public void toolAction() {
        System.out.println("eraser something");
    }
}
