class missingNum{
    public static void main(String args []){
        int arr[]={1,2,3,5,6};
        int xor=0;
        int n=arr.length+1;
        for (int i = 1; i <=n; i++) {
            xor^=i;
        }
         
         for(int x:arr){
            xor^=x;
         }
         System.out.println("ans"+xor);


         int sum=0;
         sum=n*(n+1)/2;
         int as=0;
        for(int j=0;j<arr.length;j++){
         as+=arr[j];
        }
        sum=sum-as;
         System.out.println("ans"+sum);

         // or for more space hashing
         int h[]=new int [n+1];
         for(int k:arr){
            h[k]++;
         }
         for(int l=1;l<h.length;l++){
            if(h[l]==0){
                System.out.println("Ans"+l);
                break;
            }
         }
    }
}