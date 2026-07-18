public class ispal {
    public static void main(String[] args) {
        String name="MADAM";
        name=name.toUpperCase();
        int l=0;
        int r=name.length()-1;
        boolean pal =true;
        while(l<r){
            if(name.charAt(l)!=name.charAt(r)){
              pal=false;
              break;
            }
            r--;
            l++;

        }
        if(pal)
            System.out.println("IS PALINDROME");
        else
             System.out.println("NOT PALINDROME");

     // for the reverser the Strings
    //  String a="QUES hERMANOS";
     StringBuilder a = new StringBuilder("QUES hERMANOS");
   
     System.out.println(a.reverse());
    
    // with looping also 
     String ab="QUES HERMANOS";
     for(int i=a.length()-1;i>=0;i--){
        System.out.print(a.charAt(i)+"  ");
    }
     System.out.println(" ");
    System.out.println(a.equals(ab));
     }
    
    }

