import java.util.Scanner;

public class indexfostr {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter the haystack: ");
        String haystack = sc.nextLine();

        // Input the substring to search
        System.out.print("Enter the needle: ");
        String needle = sc.nextLine();

        int index = -1; // Assume substring is not found

        // Traverse every possible starting position
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            boolean found = true;

            // Compare every character of the needle
            for (int j = 0; j < needle.length(); j++) {

                // If characters do not match
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }

            // If complete needle matched
            if (found) {
                index = i;
                break;
            }
        }

        // Output
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }

        sc.close();
}
}