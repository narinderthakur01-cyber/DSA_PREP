
import java.util.Scanner;

class large{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int arr[]={2,13,4,3,99,0,-1};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println("max largest"+max);

        /// second approach;// seconf max;
        int m=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int nums[]={2,13,4,3,99,232,0,-1};
        for(int x:nums){
            if(x>m){
                smax=m;
                m=x;
            }
             else if(x>smax){
                smax=x;
            }
        }
        
        System.out.println("max1 for second approach"+m);
        System.out.println("second MAX for approach"+smax);
    
    }
}