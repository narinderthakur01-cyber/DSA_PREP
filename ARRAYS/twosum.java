import java.util.*;
class twosum{
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
        int num[]={2,7,11,15};
        int tar=9;
        // for 0(n^2)
        for(int i=0;i<num.length-1;i++){
         for(int j=i+1;j<num.length;j++){
            if(num[i]+num[j]==tar){
                System.out.println(num[i]+"  "+ num[j]);
                break;
            }
         }
        }
        //
        int l=0;
        int r =num.length-1;
        
           while(l<r){
            int sum=num[l]+num[r];
            if(sum==tar){
                System.out.println("ans"+l + r);
               break; 
            }
            else if(sum<tar){
                l++;
            }else{
                r--;
            }

           }

           
        }


    }
