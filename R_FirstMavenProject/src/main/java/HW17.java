import java.util.ArrayList;
import java.util.List;

public class HW17 {

    public static void task1() {

        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Tan");
        list.add("Yellow");
        list.add("Orange");
        list.add("Red");
        list.add("Pink");
        list.add("Purple");
        list.add("Blue");

        list.removeIf(e -> e.indexOf('l') != -1); //remove elements including
        System.out.println(list);
    }

    public static void task2and3() {

        List<Integer> list = new ArrayList<>();
        Integer value;

        for (int i = 100; i <= 1000; i++) {
            value = i;
            list.add(value);
        }

        System.out.println(list);
        list.removeIf(e -> (e % 2) == 0); //remove even items
        System.out.println(list);

    }
}