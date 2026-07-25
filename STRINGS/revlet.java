public class revlet {
    public static void main(String[] args) {
        String s ="a-bC-dEf-ghIj";
        char arr[]=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(!Character.isLetter(arr[l])){
                l++;
            }
            else if(!Character.isLetter(arr[r])){
                   r--;
                }
               else {
                  char t=arr[r];
                  arr[r]=arr[l];
                  arr[l]=t;
                  l++;
                  r--;

               }
            }
            for(char x: arr){
                System.out.print(x);
            }
        }
    }
    

