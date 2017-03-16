package week2;

/**
 * Created by Ulyana on 26-Feb-17.
 */
public class ShellSort {
        public static void main(String[] args) {
            int[] array = {30, 2, 10, 4, 6};
            int length = array.length;

            int gap = length/2;

            while (gap > 0)
            {
                for (int i = gap; i < length; i++)
                {
                    int j = i;
                    int tempor = array[i];
                    while (j >= gap && array[j - gap] > tempor)
                    {
                        array[j] = array[j - gap];
                        j = j - gap;
                    }
                    array[j] = tempor;
                }
                gap = gap/2;
            }



            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
