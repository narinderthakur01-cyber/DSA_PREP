class uBbs{
    public static void main(String[] args) {
        int arr[]={1,1,2,3,5,6,8,9,11,19,19,20,23};
        int t=19;
        int l=0;
        int r=arr.length-1;
        int ans=arr.length;
        while(l<=r){
           int mid=(l+r)/2;
          if(arr[mid]>t){
           ans=mid;
           r=mid-1;
          }
          else{
          l=mid+1;
          }
        }
        System.out.println("Answer of Upper bound:"+ ans);
    }
}