package Task12;

public abstract class BaseEmployee {

    int baseSalary;
    int numberWorkers;

    public BaseEmployee(int baseSalary, int numberWorkers) {
        this.baseSalary = baseSalary;
        this.numberWorkers = numberWorkers;
    }

    public int getNumberWorkers() {
        return numberWorkers;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
