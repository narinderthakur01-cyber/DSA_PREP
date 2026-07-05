class majorityEl{
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int c=0;
        int n=arr.length;
        int cd=0;
        for(int i =0;i<arr.length;i++){
            if(c==0){
                c=1;
                cd=arr[i];

            } else if(arr[i]==cd){
                c++;
            } else{
                c--;
            }
        }
        int c2=0;
        for(int x:arr){
            if(x==cd){
                c2++;
            }
        }
        if(c2>n/2){
            System.out.println("ans" + "   "+c2+" "+cd);
        }
    }
}