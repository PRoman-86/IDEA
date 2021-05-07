package Task9;

public class Main {
    public static void main (String [] args){
//        Person person = new Person ("Liuna",60, 'f');
//
//        Employee employee = new Employee ("Sergey",30,'M',1000);
//        Employee employee1 = new Employee ("Anna",30, 'F',1000);
//        Employee [] employeeArray = {employee,employee1};
      //  Employee employee = new Employee("Roman",30,'M',100 );

        NewManager newManager = new NewManager(100,20, "Roman",10);

      System.out.println(newManager.getSalary());



    }
}
