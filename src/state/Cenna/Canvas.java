package state.Cenna;


public class Canvas {

    public void mouseDown(Tool tool){
        tool.toolIcon();
    }

    public void mouseUp(Tool tool){
        tool.toolAction();
    }
}
