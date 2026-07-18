public class countvc {
    public static void main(String[] args) {
        String a="PRogrAMmiNg";
        a=a.toLowerCase();
        int cc=0;
        int vc=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
              vc++;
            }
            else{
              cc++;
            }
        }
        System.out.println("count for the vowels"+vc +"  " +"Count for the Consonants"+cc);
      // lvl 2 for Lc,Uc, digit,Sc
      int lc=0;
      int uc=0;
      int d=0;
      int sc=0;
      String b="AbC#12xy$";
     for(int j=0;j<b.length();j++){
      char ch=b.charAt(j);
      if(ch>='A'&&ch<='Z'){
        uc++;
      }
      else if(ch>='a'&&ch<='z'){
        lc++;
      }
       else if(ch>='0'&&ch<='9'){
        d++;
      }
      else{
        sc++;
      }
     }
     System.out.println("Lower case : " + lc);
     System.out.println("Upper case : " + uc);
     System.out.println("Digits     : " + d);
     System.out.println("Special    : " + sc);

    }

}
