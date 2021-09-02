package co.org.escuelaing.networking;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

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

    public List<String> getComponents(){
        String currentPackage = this.getClass().getPackageName();
        
        return null;
    }
}
