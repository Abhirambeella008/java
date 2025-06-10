import java.util.ArrayList;
import java.util.List;

public class SecondLargest {
    public static int findSecondLargest(List<Integer> list) {
        if (list.size() < 2) throw new IllegalArgumentException("List must have at least two elements.");
        List<Integer> sorted = new ArrayList<>(list);
        sorted.sort(null); 
        int largest = sorted.get(sorted.size() - 1);
        // Find the next smaller element
        for (int i = sorted.size() - 2; i >= 0; i--) {
            if (sorted.get(i) < largest) {
                return sorted.get(i);
            }
        }
        throw new IllegalArgumentException("No second largest element found.");
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 4, 45, 99, 99);
        System.out.println("Second largest: " + findSecondLargest(numbers));
    }
}