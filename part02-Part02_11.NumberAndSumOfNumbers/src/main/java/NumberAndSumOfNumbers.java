
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
        
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

    }
}
