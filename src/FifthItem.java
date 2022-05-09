import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("Enter some strings, Enter no strings to get result of fifth string: ");

        for (int i = 0; i < list.size() + 1; i++) {
            String userInput = scanner.nextLine();
            if (userInput.isBlank()) {
                System.out.println("The fifth item is in the list is: " + list.get(4));
            } else {
                list.add(userInput);
            }

        }
    }
}
