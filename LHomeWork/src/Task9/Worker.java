package Task9;

public class Worker extends NewEmployee {

    public Worker(int baseSalary, int salary, String name) {
        super(baseSalary, salary, name);
    }

    @Override
    public int getSalary() {
        return getBaseSalary();
    }
}
