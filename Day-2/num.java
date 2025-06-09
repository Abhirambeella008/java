import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int zerosCount = 0;

        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] == 0) {
                zerosCount++;
            } else if(arr[i] == 1) {
                count += zerosCount;
            }
        }

        System.out.println(count);
        sc.close();
    }
}