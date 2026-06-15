public class task8 {

    static void main() {
        task8_Employee testEmp = new task8_Employee();
        testEmp.employeeSalaryPerDay = 25;

        System.out.println(task8_SalaryUtils.calculateSalaryForOneMonth(testEmp, task8_MonthUtils.january));
    }
}