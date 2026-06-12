package noBugs;

public class taskSolver_1 {
    //Task1
    // Напишите функцию, которая принимает целое число и возвращает true,
    // если оно делится на 5 и на 7 одновременно, и false в противном случае.

    public static boolean task1 (int a) {
        if ((a % 5 == 0) && (a % 7 == 0)){
            return true;
        } else {
            return false;
        }
    }

    //Task2 Определение принадлежности числа интервалу
    //Создайте функцию, которая принимает число и проверяет,
    // входит ли оно в интервал от 10 до 20 включительно.
    // Если число попадает в интервал, верните true, иначе — false.

    public static boolean task2 (int a){
        if (a >= 10 && a <= 20){
            return true;
        } else {
            return false;
        }
    }

    //Task3
    // Проверка на квадрат числа.
    // Напишите функцию, которая принимает два числа и возвращает true, если одно из чисел является
    // квадратом другого, и false в противном случае.

    public static boolean task3 (int a, int b) {
        if (( b == a * a) || ( a == b * b)) {
            return true;
        } else {
            return false;
        }
    }

    //Task4
    //Проверка последней цифры
    //Создайте функцию, которая принимает число и проверяет, заканчивается ли оно на 5.
    // Верните true, если заканчивается, и false, если нет.

    public static boolean task4(int a){
        String s = String.valueOf(a);
        int dlina = s.length();
        char val = s.charAt(dlina-1);

        if (val == '5'){
            return true;
        } else {
            return false;
        }
    }

    //Task5
    //Проверка, является ли сумма цифр четной
    //Реализуйте функцию, которая принимает число, суммирует его цифры и возвращает true,
    // если сумма четная, и false, если нечетная.

    public static boolean task5(int a){

    }

}
