package task9;

public class Employee {
        //Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
        // и поле зарплата. Класс должен иметь метод isSameName(Employee employee)
        // который возвращает true, если у сотрудника у которого был вызван метод
        // и сотрудника который был передан как параметр, одинаковое имя.

        private String name;
        private int age;
        private char gender;
        private double salary;

        public boolean isSameName (Employee employee){
            if (employee != null && this.name.equals(employee.name) ){
                return true;
            } else return false;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public int getAge (){
            return age;
        }

        public void setAge (int age){
            this.age = age;
        }

        public char getGender (){
            return gender;
        }

        public void setGender(char gender){
            this.gender = gender;
        }

        public double getSalary () {
            return salary;
        }

        public void setSalary (double salary){
            this.salary = salary;
        }
    }
