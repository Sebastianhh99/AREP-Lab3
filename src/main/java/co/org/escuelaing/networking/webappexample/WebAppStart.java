package co.org.escuelaing.networking.webappexample;

import java.io.IOException;
import java.net.URISyntaxException;

import co.org.escuelaing.networking.httpserver.HttpServer;

public class WebAppStart {
    public static void main(String[] args){
        try {
            HttpServer.getInstance().startServer(args);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
