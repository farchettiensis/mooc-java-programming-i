
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            int number = Integer.parseInt(input);
            int cube = (int) Math.pow(number, 3);

            System.out.println(cube);
//          int number = Integer.valueOf(input);;
//          System.out.println(number * number * number);
        }

    }
}
