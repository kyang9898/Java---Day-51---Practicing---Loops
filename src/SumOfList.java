import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter a list of integers:");

        for (int i = 0; i < list.size() + 1; i++) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 0) {
                for (int x = 0; x < list.size(); x++) {
                    if (x - (list.size() - 1) != 0) {
                        System.out.print(list.get(x) + ", ");
                    } else {
                        System.out.println("and " + list.get(x) + " were the items in the list");
                        sumOfNumbers(list);
                    }
                }
            } else {
                list.add(userInput);
            }
        }
    }

    public static void sumOfNumbers(ArrayList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        int totalOfNumbers = 0;
        for (int y = 0; y < list.size(); y++) {
            totalOfNumbers += list.get(y);
        }
        System.out.println("The sum of the list is: " + totalOfNumbers);
        System.out.println("Which number are you looking for in the list? ");
        int num = Integer.valueOf(scanner.nextInt());
        for (int z = 0; z < list.size(); z++) {
            if (list.get(z) == num) {
                System.out.println(num + " is at index " + z + " in the list of integers.");
            }
        }
    }
}