class ScopeExample {
    int classVar = 100; // поле класса

    void showVars() {
        int localVar = 50; // локальная переменная

        System.out.println("Переменная класса: " + classVar);
        System.out.println("Локальная переменная: " + localVar);
    }
}

public class Task3 {
    public static void main(String[] args) {
        ScopeExample obj = new ScopeExample();
        obj.showVars();
    }
}