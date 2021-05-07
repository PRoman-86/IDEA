package Task9;

public class UtilsEmployee {

    public static String findByName(OldEmployee[] oldEmployeeArray, String name) {


        for (int i = 0; i < oldEmployeeArray.length; i++) {
            if (oldEmployeeArray[i].name.equals(name)) {
                return "Name is found";

            }

        }
        return "Name is not found";

    }

    public static String findBySubSting(OldEmployee[] oldEmployeeArray, String name) {


        for (int i = 0; i < oldEmployeeArray.length; i++) {
            if (oldEmployeeArray[i].name.indexOf(name) == -1) {
                return oldEmployeeArray[i].name;

            }

        }
        return "Not found";

    }

    public static String minSalary(OldEmployee[] oldEmployeeArray, int salary) {


        int result = Integer.MAX_VALUE;
        for (int i = 0; i < oldEmployeeArray.length; i++) {
            if (oldEmployeeArray[i].salary < result) {
                oldEmployeeArray[i].salary = result;

            }

        }
        return "Min salary is" + result;


    }

    public static String maxSalary(OldEmployee[] oldEmployeeArray, int salary) {


        int result = 0;
        for (int i = 0; i < oldEmployeeArray.length; i++) {
            if (oldEmployeeArray[i].salary > result) {
                oldEmployeeArray[i].salary = result;

            }

        }
        return "Max salary is" + result;

    }

    public static OldEmployee findEmployee(OldEmployee[] oldEmployeeArray, OldEmployee oldEmployee) {


        for (int i = 0; i < oldEmployeeArray.length; i++) {
            if (oldEmployeeArray[i].equals(oldEmployee)) {
                return oldEmployeeArray[i];

            }

        }
        return null;


    }
}






