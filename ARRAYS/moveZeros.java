class moveZeros{
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,2};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
                j++;

            }
        }
        for(int x:arr){
            System.out.print(x+"  ");
        }
    }
}