import java.util.*;

class Leader {
    public static void main(String[] args) {

        int arr[] = {1,2,5,3,1,2};

        // Brute Force O(n²)
        ArrayList<Integer> brute = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {

            boolean leader = true;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] >= arr[i]) {
                    leader = false;
                    break;
                }
            }

            if(leader) {
                brute.add(arr[i]);
            }
        }

        System.out.println("Brute Force: " + brute);


        // Optimal O(n)
        ArrayList<Integer> optimal = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > max) {
                optimal.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(optimal);

        System.out.println("Optimal: " + optimal);
    }
}