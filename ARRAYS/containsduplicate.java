import java.util.*;
class containsduplicate{
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int arr[]={1,2,1,3,2,3};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(" Duplicate"+ arr[i]);
                    break;
                }

            }

        }

// for better approach we can do// uses extra spACE;
         int hash[]=new int [arr.length+2];
         for(int x=0;x<arr.length;x++){
            hash[arr[x]]++;
         }

         for(int s:hash){
            if(s>=2){
                System.out.println("dupl"+s);
            }
         }

     // for optimal// n only 
      HashSet <Integer> set= new HashSet<>();
        for(int a:arr){
            if(set.contains(a)){
                System.out.println("dupl"+a);

            }
            set.add(a);
        }
    }
}