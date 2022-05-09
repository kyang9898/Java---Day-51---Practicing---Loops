import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println(
                "Enter some strings, Once you enter an empty string then you will know the total items in the lists.");

        for (int i = 0; i < list.size() + 1; i++) {
            String numberOfItems = scanner.nextLine();
            if (numberOfItems.isBlank()) {
                System.out.println("The total amount of items in the list was: " + list.size());
            } else {
                list.add(numberOfItems);
            }
        }

    }
}
