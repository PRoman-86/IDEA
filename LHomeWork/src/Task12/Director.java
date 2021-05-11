package Task12;

import Task12.Manager;

public final class Director extends BaseEmployee {

    private final int value;

    public Director(int baseSalary, int numberWorkers, int value) {
        super(baseSalary, numberWorkers);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getSalary() {
        int result;
        if (getNumberWorkers()> 0) {
            result = getBaseSalary() * (getNumberWorkers() / 100 * getValue());
            return result;
        } else {
            return baseSalary;
        }
    }
}
