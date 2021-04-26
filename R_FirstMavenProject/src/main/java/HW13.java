import org.apache.commons.lang3.StringUtils;

public class HW13 {

    public static void main(String[] args) {

        complexAbbreviateTest();
    }

    public static void complexAbbreviateTest() {

        System.out.println("Привет ...".equals(StringUtils.abbreviate("Привет всем, кто живет на Луне", 10))); // true
        System.out.println("Привет всем, кто ...".equals(StringUtils.abbreviate("Привет всем, кто живет на Луне", 20))); // true
        System.out.println(StringUtils.abbreviate(null, 2)); // null
        System.out.println("".equals(StringUtils.abbreviate("", 1))); // true
        System.out.println("12...".equals(StringUtils.abbreviate("123 456", 5))); //true

    }

}
