package week2;

/**
 * Created by Ulyana on 26-Feb-17.
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] array = {1, 10, 0};
        int length = array.length;
        int layer = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    layer = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = layer;
                }
            }
        }


            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

