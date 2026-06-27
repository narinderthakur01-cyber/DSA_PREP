import java.util.Arrays;

class Transpose {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Print
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}