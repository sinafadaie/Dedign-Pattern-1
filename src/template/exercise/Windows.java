package template.exercise;

public class Windows {

    public void close(){
        preClose();

        System.out.println("Closing the window");

        postClose();
    }

    protected void preClose(){
    };

    protected void postClose(){
    }
}
