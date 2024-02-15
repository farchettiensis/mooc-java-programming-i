
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start: ");
        int start = scanner.nextInt();

        System.out.println("End: ");
        int end = scanner.nextInt();

        divisibleByThreeInRange(start, end);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (beginning = beginning; beginning <= end; beginning++) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
        }

    }

}
