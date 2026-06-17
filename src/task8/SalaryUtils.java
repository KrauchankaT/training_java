package task8;

public class SalaryUtils {
    //Создать класс SalaryUtils, в котором будет статический метод
    // calculateSalaryForOneMonth(Employee employee, Month month),
    // который рассчитает зарплату для переданного сотрудника за указанный месяц.

    public static double calculateSalaryForOneMonth(Employee employee, Month month){
        return employee.employeeSalaryPerDay * month.numberOfTheWorkingDays;
    }


    //В том же классе создать статический метод calculateSalaryForManyMonths(Employee employee, Month[] months),
    // который вычислит зарплату сотрудника за несколько месяцев.
    public static double calculateSalaryForManyMonths(Employee employee, Month[] months){
        return 5.5;
    }

}
