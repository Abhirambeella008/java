public class Matrix {
    public static void printSpiral(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int total = matrix.length * matrix[0].length;
        int count = 0;

        while (count < total) {
            for (int i = left; i <= right && count < total; i++) {
                System.out.print(matrix[top][i] + " ");
                count++;
            }
            top++;

            for (int i = top; i <= bottom && count < total; i++) {
                System.out.print(matrix[i][right] + " ");
                count++;
            }
            right--;

            for (int i = right; i >= left && count < total; i--) {
                System.out.print(matrix[bottom][i] + " ");
                count++;
            }
            bottom--;

            for (int i = bottom; i >= top && count < total; i--) {
                System.out.print(matrix[i][left] + " ");
                count++;
            }
            left++;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15, 16}
        };

        printSpiral(matrix);
    }
}
