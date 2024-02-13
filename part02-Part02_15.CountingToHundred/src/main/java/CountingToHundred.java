
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        
        for (int j = 100; i <= j; i++) {
            System.out.println(i);
        }
    }
}
