import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

        int arr[] = {10,20,10,30,20,10};

        HashMap<Integer,Integer> map = new HashMap<>();
         
         for(int x : arr){
         map.put(x, map.getOrDefault(x, 0) + 1);
           }
         

        System.out.println(map);
        // for given num:
        int arr1[]={1,2,2,1,3,3,2,1};
        int k=2;
        for(int l:arr1){
        
            map.put(l,map.getOrDefault(l,0)+1);
        
         System.out.println("ans"+map.get(k));
    }

      }
      
}
