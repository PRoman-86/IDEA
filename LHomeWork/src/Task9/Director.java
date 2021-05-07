package Task9;

public class Director extends NewManager {
    public Director(int baseSalary, int salary, String name, int numberWorkers) {
        super(baseSalary, salary, name, numberWorkers);
    }


@Override
    public int getSalary() {
        int result;
        if (numberWorkers > 0) {
            result = getBaseSalary() * (getNumberWorkers() / 100 * 9);
            return result;
        } else {
            return baseSalary;
        }
    }
}
