import java.util.ArrayList;
import java.util.List;

public static int SecondLargest(List<Integer> list) {
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