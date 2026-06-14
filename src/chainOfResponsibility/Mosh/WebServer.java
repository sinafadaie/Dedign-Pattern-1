package chainOfResponsibility.Mosh;

import chainOfResponsibility.HttpRequest;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }



    public void handle(HttpRequest request){
        handler.handle(request);    //start the chain recursively!
    };
}
