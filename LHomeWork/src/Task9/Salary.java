package Task9;

public class Salary {
   static int  getSum(Employee [] employeeArray){
        int result = 0;
        for (int i =0; i<employeeArray.length;i++)
            result +=employeeArray[i].salary;
       return result;
    }

}

