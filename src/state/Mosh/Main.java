package state.Mosh;

public class Main {
    public static void main(String[] arg){
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());

        canvas.mouseDown();
        canvas.mouseUp();
    }
}
