class rotatebyK{
  public static void rev(int arr[],int l,int r){
   
    while(l<r){
     int t=arr[r];
     arr[r]=arr[l];
     arr[l]=t;
     l++;
     r--;
    }
  }
 public static void rev1(int arr[],int l,int r){
   
    while(l<r){
     int t=arr[r];
     arr[r]=arr[l];
     arr[l]=t;
     l++;
     r--;
    }
  }


    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,6,7};
         int [] arr1 = {1,2,3,4,5,6,7};
         int k = 3;
         int n=arr.length;
         k=k%n;
         rev(arr,0,n-1);
         rev(arr,0,k-1);
         rev(arr,k,n-1);
  for(int x : arr){
            System.out.print(x + " ");
        }
      
       System.out.println(  );
        rev1(arr1,0,k-1);
        rev1(arr1,0,n-1);
         rev1(arr1,0,n-1);
         for(int xx : arr1){
            System.out.print(xx + " ");
        }

    }
}