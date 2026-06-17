package task8;

public class MonthUtils {

    //Создать класс MonthUtils который бы хранил подготовленные месяцы или
    // их массивы для использования (объекты класса Month).
    static Month january = makeMonth("January", 31, 20);
    static Month february = makeMonth("February", 28, 22);
    static Month march = makeMonth("March", 31, 21);
    static Month april = makeMonth("April", 30, 20);
    static Month may = makeMonth("May", 28, 22);
    static Month june = makeMonth("June", 28, 22);
    static Month july = makeMonth("July", 28, 22);
    static Month august = makeMonth("August", 28, 22);
    static Month september = makeMonth("September", 28, 22);
    static Month october = makeMonth("October", 28, 22);
    static Month november = makeMonth("November", 28, 22);
    static Month december = makeMonth("December", 28, 22);


    static Month makeMonth(String name, int days, int workingDays){
        Month Month = new Month();
        Month.nameMonth = name;
        Month.numberOfTheDays = days;
        Month.numberOfTheWorkingDays = workingDays;
        return Month;
   }
}
