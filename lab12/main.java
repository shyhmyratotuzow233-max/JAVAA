import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Пайдаланушыдан жол енгізу
        System.out.print("Жолды енгізіңіз: ");
        String text = sc.nextLine();

        // Жолды кері айналдыру
        String reversed = new StringBuilder(text).reverse().toString();

        // Нәтижені шығару
        System.out.println("Кері жол: " + reversed);

        sc.close();
    }
}