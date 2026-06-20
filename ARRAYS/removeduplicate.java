
import java.util.HashSet;

class removeduplicate{
    public static void main(String[] args) {
        int arr[]={1,1,3,3,4,4,2,2};
          int arr1[]={1,1,3,3,4,4,2,2};
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=arr[i]^xor; 
        }
        System.out.print(xor);
    
System.out.println(" ");
// not work with un sorted one ;


    int i=0;
for(int j=1;j<arr.length;j++){
    if(arr[j]!=arr[i]){
        arr[i+1]=arr[j];
        i++;

    }
} 
System.out.println(" ");
for(int s:arr){
System.out.print(s);}

HashSet<Integer> set=new HashSet<>();
for(int u:arr1){
    if(set.contains(u)){
        
    }
     else{
        set.add(u);
     }
}
System.out.println(" ");
for(int q:set){
 System.out.print(q);}
}
}