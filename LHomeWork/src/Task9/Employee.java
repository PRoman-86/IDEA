package Task9;

public class Employee {
    String name;
    Person person;

    int salary;
    public Employee(String name, int age, char sex, int salary) {
        this.person = new Person (name,age,sex);
        this.salary = salary;
        this.name =name;
    }


    boolean isSameName(Employee employee){
        return employee.person.name.equals(this.person.name);

    }

}
