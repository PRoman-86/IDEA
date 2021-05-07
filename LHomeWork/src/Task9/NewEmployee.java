package Task9;

public class NewEmployee {

    int baseSalary;
    int salary;
    String name;

    public NewEmployee(int baseSalary, int salary, String name) {
        this.baseSalary = baseSalary;
        this.salary = salary;
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
