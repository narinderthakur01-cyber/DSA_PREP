public class basicstr {
    public static void main(String[] args) {
        String name= "Narinder";
        System.err.println(name);
        // comparsion of strings 
        String a="hi";
        String b="hi";
        // if(a==b){ with same ref. 
            System.out.println(a==b);
        // }
        
      // with diff ref.
      String c=new String("hello");
      String d= new String("hello");
      System.out.println(c==d);

      // for values 
      System.out.println(c.equals(d));
      System.out.println(c.charAt(2));

    }
}
