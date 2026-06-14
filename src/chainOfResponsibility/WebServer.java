package chainOfResponsibility;

public class WebServer {
    public void handle(HttpRequest request){

        Authenticator authenticator = new Authenticator();      //we can remove these dependencies by Interfaces
        Logger logger = new Logger();                           //but it does not solve our order problem!
        Compressor compressor = new Compressor();

        authenticator.authenticate(request);
        logger.log(request);
        compressor.compress(request);
    }
}
