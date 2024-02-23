
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        int[] numbersArray = {1, 5, 3, 8, 10, 2};

        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int number : numbersArray) {
            numbersList.add(number);
        }
        
        printNumbersInRange(numbersList, 3, 8);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range: [" + lowerLimit + ", " + upperLimit + "]");

        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

}
