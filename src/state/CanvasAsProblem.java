package state;

//create an ENUM to represent our tools ()
public class CanvasAsProblem {
    private ToolType currentTool;

   public void mouseDown(){          //press mouse button
        if(currentTool == ToolType.SELECTION)
            System.out.println("selection icon");   //simulation
        else if (currentTool == ToolType.BRUSH)
            System.out.println("brush icon");
        else if (currentTool == ToolType.ERASER)
            System.out.println("eraser icon");
    }

    public void mouseUp(){           //release mouse button
        if(currentTool == ToolType.SELECTION)
            System.out.println("draw dashed rectangle");
        else if (currentTool == ToolType.BRUSH)
            System.out.println("draw a line");
        else if (currentTool == ToolType.ERASER)
            System.out.println("eraser something");
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }


}
