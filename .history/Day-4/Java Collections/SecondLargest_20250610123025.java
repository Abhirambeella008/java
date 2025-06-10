import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        try {
            int secondLargest = findSecondLargestBySorting(list);
            System.out.println("The second largest number is: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to find the second largest number using sorting
public static int findSecondLargestBySorting(List<Integer> list) {
    if (list.size() < 2) throw new IllegalArgumentException("List must have at least two elements.");
    List<Integer> sorted = new ArrayList<>(list);
    sorted.sort(null); // Sort ascending
    int largest = sorted.get(sorted.size() - 1);
    // Find the next smaller element
    for (int i = sorted.size() - 2; i >= 0; i--) {
        if (sorted.get(i) < largest) {
            return sorted.get(i);
        }
    }
    throw new IllegalArgumentException("No second largest element found.");
}
}