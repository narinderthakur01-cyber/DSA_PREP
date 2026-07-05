class maxprod{
    public static void main(String[] args) {
        int arr[]={10,3,5,2,6,20};
        int max1=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max1){
        
            max1=arr[i];
            
        }}
        for(int j=0;j<arr.length;j++){
            if(arr[j]>smax && arr[j]!=max1){
            smax=arr[j];
        }}
        for(int k=0;k<arr.length;k++){
            if(arr[k]>tmax&&arr[k]!=smax&&arr[k]!=max1){
                tmax=arr[k];
            }
        }
        int prod=0;
         System.err.println("Ans :"+ max1+" "+smax+" "+tmax);
        prod=max1*smax*tmax;
        System.err.println("Ans :"+ prod);

        // approach 2
        int mmax=Integer.MIN_VALUE;
               int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int a = 0; a < arr.length; a++) {

            if (arr[a] > mmax) {
                max3 = max2;
                max2 = mmax;
                mmax = arr[a];
            }
            else if (arr[a] > max2) {
                max3 = max2;
                max2 = arr[a];
            }
            else if (arr[a] > max3) {
                max3 = arr[a];
            }
        }

        int prodd = mmax * max2 * max3;

        System.out.println(mmax + " " + max2 + " " + max3);
        System.out.println("Product : " + prodd);
    }
}