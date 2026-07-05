class twoarr{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i =0;i<arr.length;i++){int sum=0;
            for(int j=0;j<arr[i].length;j++){
               sum+=arr[i][j];
               
            }
            System.out.println(" sum of rows :"+ sum);
        }
        for(int a=0;a<arr.length;a++){
            int sum1=0;
            for(int s=0;s<arr[a].length;s++){
                sum1+=arr[s][a];
            }
            System.out.println("sum of colums :"+ sum1);
        } 
        int sum2=0;
        for(int z=0;z<arr.length;z++){
            
              sum2+=arr[z][z];
        
       
            }
        System.out.println("sum of diagonals :" + sum2);


    int max=arr[0][0];
    for(int q=0;q<arr.length;q++){
        for(int j=0;j<arr[q].length;j++){
            if(arr[q][j]>max){
                max=arr[q][j];
            }

        }
    }
    System.out.println("Max number "+max);

    }
}