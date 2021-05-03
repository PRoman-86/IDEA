package Task9;

public class Main {
    public static void main (String [] args){
        Person person = new Person ("Liuna",60, 'f');

        Employee employee = new Employee ("Sergey",30,'M',1000);
        Employee employee1 = new Employee ("Anna",30, 'F',1000);
        Employee [] employeeArray = {employee,employee1};

        System.out.println(UtilsEmployee.findByName(employeeArray,"Anna"));

    }
}
