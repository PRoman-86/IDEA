package Task9;

public class Person {
    String name = "Liuba";
    int age = 29;
    char sex = 'w';

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String getName () {
        if (sex == 'w') {
            return "Ms" + name;
        }
        else if (sex == 'm') {
         return "Mrs" + name;
        }
        else
            return "Inccorect value";

    }
}
