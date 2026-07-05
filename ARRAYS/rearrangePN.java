import java.util.ArrayList;

class rearrangePN {
    public static void main(String[] args) {

        int arr[] = {1, 2, -3, -4, 8, -9};


        int ans[] = new int[arr.length];

        int pos = 0; // Even index for positives
        int neg = 1; // Odd index for negatives

        // Works ONLY when positive count == negative count
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }

        System.out.println("Equal Count Approach:");
        for (int x : ans) {
            System.out.print(x + " ");
        }

        System.out.println();


        int arr2[] = {1, 2, 3, -4, -5};

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Store positives and negatives separately
        for (int x : arr2) {

            if (x > 0) {
                positive.add(x);
            } else {
                negative.add(x);
            }
        }

        int i = 0;
        int p = 0;
        int n = 0;

        // Place alternate positive and negative
        while (p < positive.size() && n < negative.size()) {

            arr2[i] = positive.get(p);
            i++;
            p++;

            arr2[i] = negative.get(n);
            i++;
            n++;
        }

        // Remaining positives
        while (p < positive.size()) {
            arr2[i] = positive.get(p);
            i++;
            p++;
        }

        // Remaining negatives
        while (n < negative.size()) {
            arr2[i] = negative.get(n);
            i++;
            n++;
        }

        System.out.println("Unequal Count Approach:");
        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }
}