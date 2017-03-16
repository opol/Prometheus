package week2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Created by Ulyana on 25-Feb-17.
 */
public class SqrRoot {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 9999999999.00;
        double x1;
        double x2;
        double D= (pow(b,2)- 4*a*c);


        if (D>0&a!=0){
            x1 = (-b+sqrt(D))/(2*a);
            x2 = (-b-sqrt(D))/(2*a);
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
        else if (D>0&a==0){
            x1=0.0;
            x2=0.0;
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
        else if(D==0&a!=0){
            x1=(-b)/(2*a);
            x2=(-b)/(2*a);
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
        else if (D==0&a==0){
            System.out.println("x1=");
            System.out.println("x2=");
        }
        else {
            System.out.println("x1=");
            System.out.println("x2=");
        }
    }
}
