package Task9;

public class OldEmployee {
    String name;
    Person person;

    int salary;
    public OldEmployee(String name, int age, char sex, int salary) {
        this.person = new Person (name,age,sex);
        this.salary = salary;
        this.name =name;
    }


    boolean isSameName(OldEmployee oldEmployee){
        return oldEmployee.person.name.equals(this.person.name);

    }

}
