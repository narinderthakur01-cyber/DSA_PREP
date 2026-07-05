public class flBS {

    static int lowerBound(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int[] firstAndLast(int[] arr, int x) {
        int first = lowerBound(arr, x);

        // Edge case: element not present
        if (first == arr.length || arr[first] != x) {
            return new int[]{-1, -1};
        }

        int last = upperBound(arr, x) - 1;

        return new int[]{first, last};
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 2,3,3,3,3,3,3,3,3, 4, 5};
        int x = 3;

        int ans[] = firstAndLast(arr, x);

        System.out.println("First Occurrence : " + ans[0]);
        System.out.println("Last Occurrence  : " + ans[1]);
    }
}