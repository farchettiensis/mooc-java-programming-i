
import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers:");

        int number;
        do {
            number = scanner.nextInt();
            if (number != -1) {
                numbers.add(number);
            }
        } while (number != -1);

        Statistics allStats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();
        for (int num : numbers) {
            allStats.addNumber(num);

            if (num % 2 == 0) {
                evenStats.addNumber(num);
            } else {
                oddStats.addNumber(num);
            }
        }

//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
        System.out.println("Sum: " + allStats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
    }
}
