public class task8_MonthUtils {

    //Создать класс MonthUtils который бы хранил подготовленные месяцы или
    // их массивы для использования (объекты класса Month).
    static task8_Month january = makeMonth("January", 31, 20);
    static task8_Month february = makeMonth("February", 28, 22);
    static task8_Month march = makeMonth("March", 31, 21);
    static task8_Month april = makeMonth("April", 30, 20);
    static task8_Month may = makeMonth("May", 28, 22);
    static task8_Month june = makeMonth("June", 28, 22);
    static task8_Month july = makeMonth("July", 28, 22);
    static task8_Month august = makeMonth("August", 28, 22);
    static task8_Month september = makeMonth("September", 28, 22);
    static task8_Month october = makeMonth("October", 28, 22);
    static task8_Month november = makeMonth("November", 28, 22);
    static task8_Month december = makeMonth("December", 28, 22);


    static task8_Month makeMonth(String name, int days, int workingDays){
        task8_Month Month = new task8_Month();
        Month.nameMonth = name;
        Month.numberOfTheDays = days;
        Month.numberOfTheWorkingDays = workingDays;
        return Month;
   }
}
