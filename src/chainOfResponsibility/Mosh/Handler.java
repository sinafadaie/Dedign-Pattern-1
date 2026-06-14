package chainOfResponsibility.Mosh;
import chainOfResponsibility.HttpRequest;

public abstract class Handler {
private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){
        if (doHandle(request))      //check we have not any error
            return;                 //like authentication passed correctly!
                                    //we call the method on if (we do the job!)

        if(next != null){           //we create chain
            next.handle(request);   //by recursive call!
        }
    }

    public abstract boolean doHandle(HttpRequest request);


}
