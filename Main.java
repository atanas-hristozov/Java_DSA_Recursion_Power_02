import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(power(n, m));
    }

    private static int power(int number, int power) {
        if (power < 1) {
            return 1;
        } else {
            return number*power(number,power-1);
        }
    }
}