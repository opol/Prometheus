package week2;

/**
 * Created by Ulyana on 25-Feb-17.
 */
public class Matrix {
    public static void main(String[] args) {
            int lowerbound = 1;
            int upperbound = 25;

        for (int number = lowerbound; number <= upperbound; ++number) {
            if (number == 1|number == 21 ){
                System.out.print(" *");
            }
            else if (number == 5|number == 7|number == 9|number == 13|number == 17|number == 19|number == 25){
            System.out.print("  *");
            }
            else if(number==2|number==3|number==4|number==8) {
                System.out.print("  "+number);
            }
            else if(number==6){
                System.out.print(" "+number);
            }
            else if (number==11|number==16){
                System.out.print(number);
            }
            else {
                System.out.print(" "+number);
            }

            if (number % 5 == 0) {
                System.out.println(" ");
            }
        }
    }
}


