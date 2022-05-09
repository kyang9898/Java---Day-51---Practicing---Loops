import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println(
                "Enter a list of strings, Enter an empty string if you want to see the last item on the list.");
        for (int i = 0; i < list.size() + 1; i++) {
            String item = scanner.nextLine();
            if (item.isBlank()) {
                int lastItem = list.size() - 1;
                System.out.println("The last item in the list is: " + list.get(lastItem));
            } else {
                list.add(item);
            }
        }
    }
}