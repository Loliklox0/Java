class Person {
    void displayInfo() {
        System.out.println("Я человек.");
    }
}

class Student extends Person {
    @Override
    void displayInfo() {
        System.out.println("Я студент.");
    }
}

public class Task5 {
    public static void main(String[] args) {
        Person p = new Student(); // ссылка родителя
        p.displayInfo();          // вызывается метод Student
    }
}