
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> list = new ArrayList<>();

        for (int number : numbers) {
            list.add(number);
        }

        int sum = sum(list);
        System.out.println(sum);
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        
        for (int number : numbers) {
            sum += number;
        }
        
        return sum;
    }

}
