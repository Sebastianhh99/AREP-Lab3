package co.org.escuelaing.networking.webappexample;

import co.org.escuelaing.networking.nextspring.Component;
import co.org.escuelaing.networking.nextspring.RequestMapping;

@Component
public class MathServices {
    
    @RequestMapping("/square")
    public static Double square(String n){
        Double number = Double.parseDouble(n);
        return number*number;
    }

    @RequestMapping("/status")
    public static String status(String param){
        return "Running";
    }
}
