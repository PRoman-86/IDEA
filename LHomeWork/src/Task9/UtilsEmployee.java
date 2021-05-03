package Task9;

public class UtilsEmployee {

    public static String findByName(Employee[] employeeArray, String name) {


        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].name.equals(name)) {
                return "Name is found";

            }

        }
        return "Name is not found";

    }

    public static String findBySubSting(Employee[] employeeArray, String name) {


        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].name.indexOf(name) == -1) {
                return employeeArray[i].name;

            }

        }
        return "Not found";

    }

    public static String minSalary(Employee[] employeeArray, int salary) {


        int result = Integer.MAX_VALUE;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].salary < result) {
                employeeArray[i].salary = result;

            }

        }
        return "Min salary is" + result;


    }

    public static String maxSalary(Employee[] employeeArray, int salary) {


        int result = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].salary > result) {
                employeeArray[i].salary = result;

            }

        }
        return "Max salary is" + result;

    }

    public static Employee findEmployee(Employee[] employeeArray, Employee employee) {


        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].equals(employee)) {
                return employeeArray[i];

            }

        }
        return null;


    }
}






