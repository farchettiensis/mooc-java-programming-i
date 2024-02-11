
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeCount = 0;

        System.out.println("Give a number:");
        int number = scanner.nextInt();

        while (number != 0) {
            if (number < 0) {
                negativeCount++;
            }
            System.out.println("Give a number:");
            number = scanner.nextInt();
        }

        System.out.println("Number of negative numbers: " + negativeCount);
        scanner.close();

    }
}
