class charrev{
    public static void main(String[] args) {
        char arr[]={'h', 'e', 'l', 'l', 'o'};
        int l=0;
        int r=arr.length-1;
        while(l<r){
            char t=arr[r];
            arr[r]=arr[l];
            arr[l] =t;
            l++;
            r--;
        }
        for(char x:arr){
            System.out.print(x+" ");
        }

        // rev only the vowels
        char arr1[]={'h', 'e', 'l', 'l', 'o'};
        int L=0;
        int R=arr1.length-1;
          while(L<R){
            if(arr1[L]!='a'&& arr1[L]!='e'&&arr1[L]!='i'&& arr1[L]!='o'&& arr1[l]!='u'){
                L++;

            }
            else if(arr1[R]!='a'&& arr1[R]!='e'&& arr1[R]!='i'&& arr1[R]!='o'&& arr1[R]!='u'){
                R--;
            }
               else{
                char T=arr1[L];
                arr1[L]=arr1[R];
                arr1[R]=T;
                L++;
                R--;
               }
       
         }
         System.out.println(" ");
         for(char X:arr1){
            System.out.print(X+" ");
         }


    }
}