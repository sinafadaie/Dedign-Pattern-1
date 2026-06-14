package template.exercise;


public class Main {
    public static void main(String[] args){
        Window window = new Window();

        window.close();     //we set preClose and postClose protected
                            //to prevent access from main
                            //but because we are in same package, we have access!
                            //---------------
                            //but close() should be public

    }
}
