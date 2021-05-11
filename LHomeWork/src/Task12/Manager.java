package Task12;

import Task9.Month;

public final class  Manager extends BaseEmployee {
    private int numberWorkers;
    private final int  value;

    public Manager(int baseSalary, int numberWorkers, int numberWorkers1, int value) {
        super(baseSalary, numberWorkers);
        this.numberWorkers = numberWorkers1;
        this.value = value;
    }

    public int getValue() {
        return value;
    }



    public int getNumberWorkers() {
        return numberWorkers;
    }

    public void setNumberWorkers(int numberWorkers) {
        this.numberWorkers = numberWorkers;
    }
    public final int getSalary(Month[] monthArray) {
        int result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += monthArray[i].getNumberOfWorkDays() * getBaseSalary() + (getNumberWorkers()/100*getValue());
        }

        return result;
    }
}


