package Task9;

public class Employee {

    private String name;
    private int age;
    private char sex;
    private int salary;
    private int baseSalary;

    public Employee(String name, int age, char sex, int salary, int baseSalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalary(Month[] monthArray){
        int result = 0;
        for (int i = 0; i< monthArray.length; i++){
            result += monthArray[i].getNumberOfWorkDays() * this.getSalary();
        }

        return result;

    }
}

