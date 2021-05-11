import org.apache.commons.lang3.StringUtils;

public class AbbreviateString_Task13 {
    static String str;

    public static void main(String[] args) {
        String string = "Рома ест груши на обед и пьет пиво";
         str = StringUtils.abbreviate(string, 5);

        System.out.println(test());
        System.out.println(str);


    }

    public static Boolean test(){
        if(str.equals("Ро...")){
            return true;
             }
        else
            return false;
    }
}







