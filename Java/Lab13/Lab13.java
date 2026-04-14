import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Lab13 {

    public static void main(String[] args) {

        List<Integer> сандар = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> сөздер = Arrays.asList("алма", "банан", "апельсин", "груша", "ананас", "киви");

        BinaryOperator<Integer> қосу = (a, b) -> a + b;
        System.out.println(қосу.apply(5, 3));

        Function<String, String> үлкенӘріп = s -> s.toUpperCase();
        System.out.println(үлкенӘріп.apply("java"));

        Predicate<Integer> тақСан = n -> n % 2 != 0;
        сандар.stream().filter(тақСан).forEach(System.out::println);

        сандар.stream().map(n -> n * n).forEach(System.out::println);

        int максимум = сандар.stream().max(Integer::compare).orElse(0);
        System.out.println(максимум);

        сөздер.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        сөздер.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);

        сөздер.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        сандар.forEach(System.out::println);

        Optional<Integer> минимум = сандар.stream().min(Integer::compare);
        System.out.println(минимум.orElse(0));

        Consumer<String> шығару = x -> System.out.println(x);
        шығару.accept("Сәлем!");

        Supplier<Integer> кездейсоқ = () -> new Random().nextInt(100);
        System.out.println(кездейсоқ.get());

        List<Student> студенттер = new ArrayList<>();
        студенттер.add(new Student("Айбек", 20, 85));
        студенттер.add(new Student("Марат", 22, 75));
        студенттер.add(new Student("Дана", 19, 90));

        студенттер.stream()
                .sorted(Comparator.comparing(s -> s.age))
                .forEach(System.out::println);

        студенттер.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);

        сандар.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        Map<Integer, List<Student>> топтар =
                студенттер.stream()
                        .collect(Collectors.groupingBy(s -> s.age));
        System.out.println(топтар);

        int сумма = сандар.stream().reduce(0, Integer::sum);
        System.out.println(сумма);

        Arrays.asList(1,2,2,3,3,4,5,5)
                .stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        List<List<Integer>> тізімдер = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        тізімдер.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        List<Integer> заказдар = Arrays.asList(500, 1500, 2000, 700, 3000);

        заказдар.stream()
                .filter(z -> z > 1000)
                .sorted()
                .forEach(System.out::println);
    }
}

class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return name + " " + age + " " + grade;
    }
}