import java.util.Arrays;

class add1 {


    // Approach 1 : Convert to Number
    
    static void approach1() {

        int arr[] = {1, 2, 4};

        int sum = 0;

        // Convert digit array into a number.
        // Accurate only when the number fits within int.
        // (Use long for a slightly larger range.)
        for (int x : arr) {
            sum = (sum * 10) + x;
        }

        // Add one
        sum++;

        System.out.println("Approach 1 : " + sum);

        // Limitation:
        // Doesn't work for very large inputs like
        // {9,9,9,9,9,9,9,9,9,9,9...}
        // because int/long will overflow.
        // Also, GFG expects the answer as an array.
    }

    // ---------------------------
    // Approach 2 : Digit-by-Digit (Interview / GFG)
    // ---------------------------
    static int[] approach2(int arr[]) {

        int n = arr.length;

        // Start from the last digit because
        // adding 1 affects the rightmost digit first.
        for (int i = n - 1; i >= 0; i--) {

            // If digit is less than 9,
            // simply increase it and return.
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }

            // If digit is 9,
            // it becomes 0 and carry moves left.
            arr[i] = 0;
        }

        // If we reach here,
        // every digit was 9.
        // Example:
        // 999 -> 000
        // Need: 1000

        int ans[] = new int[n + 1];

        // Java initializes all elements to 0.
        // ans = [0,0,0,0]
        // Make first digit 1.
        ans[0] = 1;

        return ans;
    }

    public static void main(String[] args) {

        approach1();

        int arr[] = {9, 9, 9};

        System.out.println("Approach 2 : " +
                Arrays.toString(approach2(arr)));
    }
}