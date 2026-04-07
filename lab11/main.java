import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Бірінші санды енгізіңіз: ");
        int a = scanner.nextInt();

        System.out.print("Екінші санды енгізіңіз: ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Қосындысы: " + sum);

        scanner.close();
    }
}