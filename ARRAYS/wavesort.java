

class wavesort{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length-1;i+=2){
            int t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
        }
        for(int x:arr){
            System.out.println("Ans:"+x);
        }

    }
}