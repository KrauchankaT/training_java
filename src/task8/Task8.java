package task8;

public class Task8 {

    static void main() {
        Employee testEmp = new Employee();
        testEmp.employeeSalaryPerDay = 25;

        System.out.println(SalaryUtils.calculateSalaryForOneMonth(testEmp, MonthUtils.january));
    }
}