package task5;

import java.util.Arrays;

public class HW5 {
    static void main() {
        /* Task1. Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все нечетные числа из массива. */

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        System.out.println("Task 1");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        /* Task 2.   Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все значения массива больше 5. */
        System.out.println ();
        System.out.println("Task 2");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5){
                System.out.print(array[i] + " ");
            }
        }

        /* Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо увеличить все значения массива на 15. */

        System.out.println();
        System.out.println("Task 3");
        for (int i = 0; i < array.length; i++) {
            int newValue = array[i];
            System.out.print(newValue + 15);
        }

        System.out.println();
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] += 15;
        }
        System.out.println(Arrays.toString(array));
    }
}
