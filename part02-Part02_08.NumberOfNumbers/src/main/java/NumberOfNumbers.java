
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;

        System.out.println("Give a number:");
        int number = scanner.nextInt();

        while (number != 0) {
            numberCount++;
            System.out.println("Give a number:");
            number = scanner.nextInt();
        }

        System.out.println("Number of numbers: " + numberCount);
        scanner.close();

    }
}
