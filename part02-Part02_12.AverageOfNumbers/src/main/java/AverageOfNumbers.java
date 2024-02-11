
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;

        while (number != 0) {
            sum += number;
            count++;

            System.out.println("Give a number:");
            number = scanner.nextInt();

        }

        double average = (double) sum / count;
        System.out.println("Average of the numbers: " + average);
    }
}
