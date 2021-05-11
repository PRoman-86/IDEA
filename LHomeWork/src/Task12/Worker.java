package Task12;

import Task9.NewEmployee;

public class Worker extends NewEmployee {

    public Worker(int baseSalary, int salary, String name) {
        super(baseSalary, salary, name);
    }

    @Override
    public final int getSalary() {
        return getBaseSalary();
    }
}
