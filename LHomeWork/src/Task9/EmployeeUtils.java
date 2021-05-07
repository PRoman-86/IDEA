package Task9;

public class EmployeeUtils {

    public static String findByName(NewEmployee[] newEmployeeArray, String name) {


        for (int i = 0; i < newEmployeeArray.length; i++) {
            if (newEmployeeArray[i].name.equals(name)) {
                return "Name is found";

            }

        }
        return "Name is not found";

    }

    public static String findBySubSting(NewEmployee[] newEmployeeArray, String name) {


        for (int i = 0; i < newEmployeeArray.length; i++) {
            if (newEmployeeArray[i].name.indexOf(name) == -1) {
                return newEmployeeArray[i].name;

            }

        }
        return "Not found";

    }

    public static int sumSalary(NewEmployee[] newEmployeeArray, String name) {

        int summa = 0;
        for (int i = 0; i < newEmployeeArray.length; i++) {

            summa += newEmployeeArray[i].salary;

        }

        return summa;
    }

    public static String minSalary(NewEmployee[] newEmployeeArray, int salary) {


        int result = Integer.MAX_VALUE;
        for (int i = 0; i < newEmployeeArray.length; i++) {
            if (newEmployeeArray[i].salary < result) {
                newEmployeeArray[i].salary = result;

            }

        }
        return "Min salary is" + result;


    }

    public static String maxSalary(NewEmployee[] newEmployeeArray, int salary) {


        int result = 0;
        for (int i = 0; i < newEmployeeArray.length; i++) {
            if (newEmployeeArray[i].salary > result) {
                newEmployeeArray[i].salary = result;

            }


        }
        return "Min salary is" + result;

    }

    public static String minWorkers(NewManager[] newManagerArray, int numberWorkers) {


        int result = Integer.MAX_VALUE;
        for (int i = 0; i < newManagerArray.length; i++) {
            if (newManagerArray[i].salary < result) {
                newManagerArray[i].salary = result;

            }

        }
        return "Min number of workers are" + result;


    }

    public static String maxWorkers(NewManager[] newManagerArray, int numberWorkers) {


        int result = 0;
        for (int i = 0; i < newManagerArray.length; i++) {
            if (newManagerArray[i].salary > result) {
                newManagerArray[i].salary = result;

            }


        }
        return "Min number of  workers are" + result;

    }

    public static String minAllowance(NewManager[] newManagerArray, int salary, int baseSalary) {


        int result = Integer.MAX_VALUE;
        int allowance;

        for (int i = 0; i < newManagerArray.length; i++) {
            allowance =  newManagerArray[i].salary-newManagerArray[i].baseSalary;
            if (allowance < result) {
                allowance = result;
            }

        }
        return "Min allowance is" + result;


    }

    public static String maxAllowance(NewManager[] newManagerArray, int salary) {


        int result = 0;
        int allowance;
        for (int i = 0; i < newManagerArray.length; i++) {
            allowance =  newManagerArray[i].salary-newManagerArray[i].baseSalary;
            if (newManagerArray[i].salary > result) {
                newManagerArray[i].salary = result;

            }


        }
        return "Min allowance is" + result;

    }
}
