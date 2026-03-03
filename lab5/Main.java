import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Сандарды енгізу
        System.out.print("Бірінші санды енгізіңіз: ");
        double num1 = scanner.nextDouble();

        System.out.print("Екінші санды енгізіңіз: ");
        double num2 = scanner.nextDouble();

        // Амал таңбасын енгізу
        System.out.print("Амал таңбасын енгізіңіз (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Switch арқылы есептеу
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Нәтиже: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Нәтиже: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Нәтиже: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Нәтиже: " + result);
                } else {
                    System.out.println("Қате: 0-ге бөлуге болмайды!");
                }
                break;

            default:
                System.out.println("Қате: дұрыс амал таңбасын енгізіңіз!");
        }

        scanner.close();
    }
}