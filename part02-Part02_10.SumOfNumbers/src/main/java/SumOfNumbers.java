
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Give a number:");
        int number = scanner.nextInt();

        while (number != 0) {
            sum += number;

            System.out.println("Give a number:");
            number = scanner.nextInt();
        }

        System.out.println("Sum of the numbers: " + sum);
        scanner.close();

    }
}
