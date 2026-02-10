class Person {
    String name;
    int age;
}

class Student extends Person {
    String group;
}

public class Task4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Алексей";
        s.age = 19;
        s.group = "ИС-2204";

        System.out.println(s.name + ", " + s.age + ", " + s.group);
    }
}