import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter a list of integers: ");
        for (int i = 0; i < list.size() + 1; i++) {
            // int itemInput = scanner.nextInt();
            int itemInput = Integer.valueOf(scanner.nextLine());
            if (itemInput == 0) {
                System.out.println("Done entering integers into the list.");
                System.out.println("What number are you looking for in the list?");
                // int itemNumber = scanner.nextInt();
                int itemNumber = Integer.valueOf(scanner.nextLine());
                for (int x = 0; x < list.size(); x++) {
                    if (list.get(x) == itemNumber) {
                        System.out.println(itemNumber + " is at index " + x);
                    }
                }
            } else {
                list.add(itemInput);
            }
        }
    }
}
