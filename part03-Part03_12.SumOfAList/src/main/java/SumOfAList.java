
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        int summan = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        for (int luku : list) {
             summan += luku; 
        }
        
        System.out.println("Sum: " + summan);


    }
}
