import task9.Employee;
import task9.Person;
import task9.Salary;

public void main (){
    Person person1 = new Person();

    person1.setName("Vasya");
    person1.setAge(25);
    person1.setGender('M');

    System.out.println("Person1: " + person1.getName());

    Person person2 = new Person();
    person2.setName("Manya");
    person2.setAge(23);
    person2.setGender('F');

    System.out.println("Person2: " + person2.getName());

    Employee employee1 = new Employee();
    employee1.setName("Kolya");
    employee1.setSalary(500);

    Employee employee2 = new Employee();
    employee2.setName("Olya");
    employee2.setSalary(654.8);

    Employee employee3 = new Employee();
    employee3.setName("Olya");
    employee3.setSalary(454.98);
    //boolean testMet = emploee1.isSameName("Manya");

    System.out.println(employee2.isSameName(employee3));

    Employee[] empArray = {employee2, employee1, employee3};

    System.out.println("TotalSalary: " + Salary.getSum(empArray));


}