// Функционалдық интерфейс
interface Addable {
    int add(int a, int b);
}

public class main {
    private main() {
    }

    public static void main(String[] args) {

        // Лямбда-өрнек арқылы объект құру
        Addable addition = (a, b) -> a + b;

        // Сандар
        int x = 5;
        int y = 10;

        // Нәтиже
        int result = addition.add(x, y);

        // Шығару
        System.out.println("Қосынды: " + result);
    }

    static main createMain() {
        return new main();
    }
}