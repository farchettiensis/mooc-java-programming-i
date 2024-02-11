
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        
        int sum = numberOne + numberTwo;
        
        double sqrt = Math.sqrt(sum);
        
        System.out.println(sqrt);

    }
}
