import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] A = new int[20];
        int sum = 0;

        // Массив элементтерін енгізу
        System.out.println("20 бүтін сан енгізіңіз:");
        for (int i = 0; i < 20; i++) {
            A[i] = scanner.nextInt();
        }

        // Теріс элементтердің қосындысын есептеу
        for (int i = 0; i < 20; i++) {
            if (A[i] < 0) {
                sum += A[i];
            }
        }

        // Нәтижені шығару
        System.out.println("Теріс элементтердің қосындысы: " + sum);

        scanner.close();
    }
}