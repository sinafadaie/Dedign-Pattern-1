package template.exercise;

public class Window extends Windows{

    //each custom window can implement
    //their pre/post closing action
    @Override
    protected void postClose(){
        System.out.println("this costume class just need some action after closing!");
    }
}
