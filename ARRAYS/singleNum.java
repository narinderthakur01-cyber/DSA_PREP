import java.util.HashSet;

class SingleNumber {

    public static void main(String[] args) {

        int nums[] = {4, 1, 2, 1, 2};

        // Approach 1: Brute Force
        int ans1 = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                ans1 = nums[i];
                break;
            }
        }

        System.out.println("Brute Force: " + ans1);

        // Approach 2: HashSet
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (set.contains(x)) {
                set.remove(x);
            } else {
                set.add(x);
            }
        }

        int ans2 = set.iterator().next();
        System.out.println("HashSet: " + ans2);

        // Approach 3: XOR (Optimal)
        int ans3 = 0;

        for (int x : nums) {
            ans3 ^= x;
        }

        System.out.println("XOR: " + ans3);
    }
}