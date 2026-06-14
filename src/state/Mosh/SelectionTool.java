package state.Mosh;

public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("draw dashed rectangle");
    }
}
