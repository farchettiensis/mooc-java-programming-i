
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta listan lukujen summan laskeminen tänne
        ArrayList<Integer> listan = new ArrayList<>();
        int summan = 0;
        
        while (true) {
            int luku = scanner.nextInt();
            if (luku == -1) {
                break;
            }
            listan.add(luku);
        }
        
        for (int i : listan) {
            summan += i;
        }
        
        System.out.println("Average: " + ((double) summan / listan.size()));
        
    }
}
