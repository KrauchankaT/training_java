package noBugs;

public class tasksPart1 {

    public static void main() {

        System.out.println("Делится ли наше число на 5 и 7 одновременно " + taskSolver_1.task1(35));

        boolean resultTask2 = taskSolver_1.task2(3);
        System.out.println("Число принадледит интервалу от 10 до 20 " + resultTask2);

        boolean resultTask3 = taskSolver_1.task3(17, 4);
        System.out.println(resultTask3);

        boolean resultTask4 = taskSolver_1.task4(- 1286);
        System.out.println(resultTask4);

    }
}
