package week2;

/**
 * Created by Ulyana on 27-Feb-17.
 */
public class BinarySearch {
    public static void main(String[] args) {

        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 6;


        int low = 0;
        int high = data.length;
        int middle = high / 2;
        int j = middle - 1;
        int i = middle;
        boolean isNumIn1Part=false;


        for (i = middle; i <= high - 1; i++) {
            if (data[i] == numberToFind) {
                System.out.println(i);
                return;
            } else if (data[i] != numberToFind&& j>=middle-1 && i<high-1 ) {
                for (j = middle - 1; j >= low; j--) {
                    if (data[j] == numberToFind) {
                        System.out.println(j);
                        return;
                    } else if (data[j] != numberToFind) {
                        isNumIn1Part=false;
                    }
                }

            } else if (isNumIn1Part==false && i == high - 1 && data[i] != numberToFind) {
                System.out.println("-1");
                return;
            }

        }
    }
}


