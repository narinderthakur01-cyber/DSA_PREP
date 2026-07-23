import java.util.*;

public class validPal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String:");
        String s = in.nextLine();

        int l = 0;
        int r = s.length() - 1;

        boolean palindrome = true;

        while (l < r) {

            // Skip special characters from left
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            // Skip special characters from right
            else if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            // Compare characters
            else {

                char L = Character.toLowerCase(s.charAt(l));
                char R = Character.toLowerCase(s.charAt(r));

                if (L != R) {
                    palindrome = false;
                    break;
                }

                l++;
                r--;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        in.close();
    }
}