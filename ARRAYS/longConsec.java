import java.util.*;

class longConsec {

    static boolean contains(int arr[], int target) {
        for(int num : arr) {
            if(num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = {100,4,200,1,3,2};

        // ---------------- BRUTE FORCE ----------------
        int longestBF = 0;

        for(int i = 0; i < arr.length; i++) {

            int x = arr[i];
            int count = 1;

            while(contains(arr, x + 1)) {
                x++;
                count++;
            }

            longestBF = Math.max(longestBF, count);
        }

        System.out.println("Brute Force Answer: " + longestBF);

        // ---------------- OPTIMAL ----------------
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        int longestOptimal = 0;

        for(int num : set) {

            if(!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while(set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longestOptimal = Math.max(longestOptimal, count);
            }
        }

        System.out.println("Optimal Answer: " + longestOptimal);
    }
}