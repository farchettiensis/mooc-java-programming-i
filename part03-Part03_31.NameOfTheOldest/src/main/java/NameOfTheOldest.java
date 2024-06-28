
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String nameOldest = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int age = Integer.parseInt(parts[1]);

            if (age > oldest) {
                oldest = age;
                nameOldest = parts[0];
            }

        }

        System.out.println("Name of the oldest: " + nameOldest);

    }
}
