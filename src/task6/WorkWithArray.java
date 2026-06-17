package task6;

public class WorkWithArray {
    static void main() {
        /* Task1
        Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6}; необходимо вывести сумму всех значений массива.*/

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        /* Task2
        Дан массив: int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива. .*/
        /* Task3
        необходимо вывести максимальное значение массива.*/
        /* Task4
        необходимо вывести количество элементов в массиве
         */

        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int newSum = 0;
        int maxVal = array2[0][0];
        int numEl = 0;

        for (int i = 0; i < array2.length; i++) {
            int newSumEl = 0;

            for (int j = 0; j < array2[i].length; j++) {
                newSum += array2[i][j];
                newSumEl += array2[i][j];
                numEl +=1;

                if (maxVal < array2[i][j]){
                    maxVal = array2[i][j];
                }
            }
            System.out.println("Сумма " + i + " элемента: " + newSumEl);
        }
        System.out.println("Sum: " + newSum);
        System.out.println("Max: " + maxVal);
        System.out.println("The number of Elements: " + numEl);
    }
}
