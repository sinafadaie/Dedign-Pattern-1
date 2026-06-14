package chainOfResponsibility.Mosh;

import chainOfResponsibility.HttpRequest;

public class Main {
    public static void main(String[] args){
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);   //we linked handler obj
                                                              //it's start from authenticator
                                                              //so we create webServer by authenticator obj
        webServer.handle(new HttpRequest("admin","1234"));

    }
}
