package Task9;

public class Salary {
   static int  getSum(OldEmployee[] oldEmployeeArray){
        int result = 0;
        for (int i = 0; i< oldEmployeeArray.length; i++)
            result += oldEmployeeArray[i].salary;
       return result;
    }

}

