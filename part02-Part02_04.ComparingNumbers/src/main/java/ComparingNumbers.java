
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        if (i > j) {
            System.out.println(i + " is greater than " + j + ".");
        } else if (j > i) {
            System.out.println(i + " is smaller than " + j + ".");
        } else {
            System.out.println(i + " is equal to " + j + ".");
        }

    }
}
