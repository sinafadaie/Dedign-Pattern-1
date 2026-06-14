package chainOfResponsibility.Mosh;

import chainOfResponsibility.HttpRequest;

public class Authenticator extends Handler{

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {

        var isValid = (request.getUsername() == "admin" &&
                request.getPassword() == "1234");
        System.out.println("Authenticated");

        return !isValid;    //if t's correct we can pass the step
                            //so we return false to  "if (doHandle(request))"
                            //to don't stop the chain
    }
}
