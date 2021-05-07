package Task9;

public class NewManager extends Worker {
    public NewManager(int baseSalary, int salary, String name, int numberWorkers) {
        super(baseSalary, salary, name);
        this.numberWorkers = numberWorkers;
    }



    int numberWorkers;

    public int getNumberWorkers() {
        return numberWorkers;
    }

    public void setNumberWorkers(int numberWorkers) {
        this.numberWorkers = numberWorkers;
    }

    public int getSalary() {

        if (numberWorkers > 0) {

            return (int) (getBaseSalary() * (getNumberWorkers() / 100.0 * 3));
        }
        else{
        return super.getBaseSalary();
        }
    }
}



