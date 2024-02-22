
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        while (true) {
            int luku = scanner.nextInt();
            if (luku == 9999) {
                break;
            }
            numberList.add(luku);
        }

        int smallest = numberList.get(0);

        for (int i = 0; i < numberList.size(); i++) {
            int number = numberList.get(i);
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numberList.size(); i++) {
            int number = numberList.get(i);
            if (smallest == number) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
