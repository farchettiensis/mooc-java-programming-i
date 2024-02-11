
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        double result = Math.pow(number, 2);
        int intResult = (int) result;
        
        System.out.println(intResult);
    }
}
