import java.util.Arrays;

public class HW6_3_difficultTasks {
    static void main() {
        /* Task1
        Даны температуры воздуха за несколько дней:
        int[] temps = {18, 20, 17, 19, 16, 15, 21};
        Необходимо посчитать сколько раз за эти дни температура падала в сравнении с предыдущим днем. */

        int[] temps = {18, 20, 17, 19, 16, 15, 21};

        int numb = 0;
        for (int i = 0; i < temps.length - 1; i++) {
            if (temps[i] > temps[i +1]){
                numb += 1;
            }
        }
        System.out.println(numb);

        /* Task2
        Дан массив:
        int[] arr = {1, 2, 3, 4, 5};
        Необходимо “сдвинуть” этот массив влево на одну позицию так, чтобы получилось:
        {2, 3, 4, 5, 1} */

        int[] arr = {1, 2, 3, 4, 5};

        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++){
            if (i < (arr.length - 1)) {
                arr1[i] = arr[i + 1];
                System.out.println(i + " element: " + arr1[i]);
            }
        }
        arr1[arr1.length-1] = arr[0];
        System.out.println("New array: " + Arrays.toString(arr1));

    }
}
