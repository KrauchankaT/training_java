package task9;

public class Salary {

    //Необходимо создать класс Salary с единственным методом
    // - getSum(Employee[] employeeArray), метод должен возвращать
    // сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода

    public static double getSum(Employee[] employeeArray){
        double totalSalary = 0;

        for (Employee emp : employeeArray) {
            if (emp != null) {
                totalSalary += emp.getSalary();
            }
        }
        return totalSalary;
    }
}
