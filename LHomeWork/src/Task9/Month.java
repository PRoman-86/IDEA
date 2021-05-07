package Task9;

public class Month {
  private   String monthName;
  private  int numberOfDays;
  private int numberOfWorkDays;

    public Month(String monthName, int numberOfDays, int numberOfWorkDays) {
        this.monthName = monthName;
        this.numberOfDays = numberOfDays;
        this.numberOfWorkDays = numberOfWorkDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfWorkDays() {
        return numberOfWorkDays;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setNumberOfWorkDays(int numberOfWorkDays) {
        this.numberOfWorkDays = numberOfWorkDays;
    }
}
