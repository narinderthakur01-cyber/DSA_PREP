

class rmdulp{
    public static void main(String[] args) {
   
            String s = "aaabbbbccdaa";

        StringBuilder ans = new StringBuilder();

        ans.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(i - 1)) {
                ans.append(s.charAt(i));
            }
        }

        System.out.println(ans);
    }
}


