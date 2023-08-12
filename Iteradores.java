package iteradores;

import java.util.ArrayList;
/**
 *
 * @author Surface
 */
public class Iteradores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String s1 = "Lunay";
        String s2 = "David";
        String s3 = "Ana";
        String s4 = "Lunay";
        
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        
        for(String s: arr){
            if(s.equalsIgnoreCase("David")){
                arr.remove(s);
                System.out.println(s);
                break;
            }            
        }
    }
    
}