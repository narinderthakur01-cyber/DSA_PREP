class longconsec1{
    public static void main(String[] args) {
        int arr[]={0, 1, 0, 1, 1, 1, 1,0};
        int c=0;
        int mc=0;
        for(int i=0;i<arr.length;i++){
         if(arr[i]==1){
            c++;
         } else  if(arr[i]==0){
            mc=Math.max(mc,c);
            c=0;
         }}
        System.out.println("answers: "+ mc);
    }
}