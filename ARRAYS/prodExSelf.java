import java.util.ArrayList;

class prodExSelf{
    public static void main (String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Double> listt=new ArrayList<>();
        int arr[]={10,3,5,6,2};

        // Brute Force
        for(int i=0;i<arr.length;i++){
            int p=1;
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    p*=arr[j];
                }
            }
            list.add(p);
        }

        for(int k:list){
            System.out.println("Ans: "+k);
        }

        // Division Approach
        int p1=1;

        for(int l=0;l<arr.length;l++){
            p1*=arr[l];
        }

        double d1=1;

        for(int j=0;j<arr.length;j++){
            d1=p1/arr[j];
            listt.add(d1);
        }

        System.out.println(listt);

        // Prefix Suffix Approach
        int prefix[]=new int[arr.length];
        int suffix[]=new int[arr.length];
        int ans[]=new int[arr.length];

        prefix[0]=1;
        for(int t=1;t<arr.length;t++){
            prefix[t]=prefix[t-1]*arr[t-1];
        }

        suffix[arr.length-1]=1;
        for(int y=arr.length-2;y>=0;y--){
            suffix[y]=suffix[y+1]*arr[y+1];
        }

        for(int i=0;i<arr.length;i++){
            ans[i]=prefix[i]*suffix[i];
        }

        System.out.print("Prefix : ");
        for(int x:prefix){
            System.out.print(x+" ");
        }

        System.out.print("\nSuffix : ");
        for(int x:suffix){
            System.out.print(x+" ");
        }

        System.out.print("\nAnswer : ");
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}