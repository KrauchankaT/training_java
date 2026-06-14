public class HW7 {
    /* Необходимо написать 4 метода:
    сложение 2х чисел
    вычитание 2х чисел
    умножение 2х чисел
    деление 2х чисел*/

    public static int sum (int a, int b) {
        return a + b;
    }

    public static int substraction (int a, int b) {
        return a - b;
    }

    public static int ymn (int a, int b) {
        return a * b;
    }

    public static double del (double a, double b){
        return a/b;
    }

    public static int findSmallestInt(int[] args) {

        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < args.length; i++){
            if (minVal > args[i]) {
                minVal = args[i];
            }
        }
        return minVal;
    }

    public static boolean inLove (int flower1, int flower2) {
        return flower1 % 2 != flower2 % 2;
    };

    public static String countingSheep(int num) {
        String test = "";

        for (int i = 1; i <= num; i++){
            test = test + i + " sheep...";
        }

        return test;
    }

}
