import java.util.*;
import java.lang.Math;

public class Roots {
    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
    double x, y, z;
    double a, b;

         System.out.println("value of x,y,z");
         x = scan.nextDouble();
    y= scan.nextDouble();
        z   = scan.nextDouble();

          double k;
         k= (Math.pow(y,2)- 4*x*z);
        x = (-y + Math.pow(k,0.5))/(2*x);
    y = (-y - Math.pow(k,0.5))/(2*x);
        System.out.println(" The ans is : " +x+ "and " + y );
}
    }