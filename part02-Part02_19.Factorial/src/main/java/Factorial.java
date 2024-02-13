
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int i = scanner.nextInt();
        int factorial;

        for (factorial = 1; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);

    }
}
