package co.org.escuelaing.networking.webappexample;

import co.org.escuelaing.networking.nextspring.Component;
import co.org.escuelaing.networking.nextspring.GetMapping;

@Component
public class MathServices {
    
    @GetMapping("/square")
    public static Double square(String n){
        Double number = Double.parseDouble(n);
        return number*number;
    }
}
