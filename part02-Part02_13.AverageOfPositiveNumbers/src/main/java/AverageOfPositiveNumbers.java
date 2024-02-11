
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int count = 0;
        int sum = 0;

        while (number != 0) {
            if (number > 0) {
                count++;
                sum += number;
            }
            number = scanner.nextInt();
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
