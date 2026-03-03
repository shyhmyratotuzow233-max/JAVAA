import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] A = new double[12];
        double kobeytindi = 1;
        boolean barMa = false;

        System.out.println("Массивтің 12 элементін енгізіңіз:");

        for (int i = 0; i < 12; i++) {
            A[i] = input.nextDouble();
        }

        for (int i = 0; i < 12; i++) {
            if (A[i] < 0) {
                kobeytindi *= A[i];
                barMa = true;
            }
        }

        if (barMa) {
            System.out.println("Теріс элементтердің көбейтіндісі: " + kobeytindi);
        } else {
            System.out.println("Массивте теріс элементтер жоқ");
        }

        input.close();
    }
}
