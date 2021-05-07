package Task9;

public class Manager extends Employee {
    private int numberWorkers;

    public Manager(String name, int age, char sex, int salary, int baseSalary, int numberWorkers) {
        super(name, age, sex, salary, baseSalary);
        this.numberWorkers = numberWorkers;
    }

    public int getNumberWorkers() {
        return numberWorkers;
    }

    public void setNumberWorkers(int numberWorkers) {
        this.numberWorkers = numberWorkers;
    }
        public int getSalary(Month[] monthArray) {
        int result = 0;
        for (int i = 0; i < monthArray.length; i++) {
          result += monthArray[i].getNumberOfWorkDays() * getBaseSalary() + (getNumberWorkers()/100*9);
        }

        return result;
    }
}