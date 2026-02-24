public class SumExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N санын енгізіңіз: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Әр санды қосамыз
        }

        System.out.println("1-ден " + n + "-ге дейінгі сандардың қосындысы: " +
                sum);
    }
}