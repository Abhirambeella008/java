import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();

        System.out.println("Enter items (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            list.add(input);
        }

        for (String item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }

        System.out.println("List after removing duplicates:");
        System.out.println(result);
    }
}
