    import java.util.*;

public class Wigglesort {
    public static void main(String[] args) {

        int arr[] = {3, 5, 2, 1, 6, 4};

        for (int i = 1; i < arr.length; i += 2) {

            // Compare with left
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }

            // Compare with right
            if (i + 1 < arr.length && arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
    