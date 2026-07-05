class bs{
    public static void main(String[] args) {
        int arr[]={3,4,6,7,8,9,12,16,17};
      int n=arr.length;
      int l=0;
      int r=n-1;
      int t=17;
      while(l<=r){
       int  mid=(l+r)/2;
        if (arr[mid]==t){
            System.out.println("ans:"+ mid +" ->"+arr[mid]);
            return;
        }
        if(arr[mid]>t){
              r=mid-1;
        }
        else{
          
            l=mid+1;
        }
      }
            System.out.println("Not Found");
}
}