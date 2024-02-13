
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int i = scanner.nextInt();
        
        System.out.println("Last number?");
        int j = scanner.nextInt();
        int sum = 0;

        for (i = i; i <= j; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);

    }
}
