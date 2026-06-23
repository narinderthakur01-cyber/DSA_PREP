import java.util.*;
class countsubSumk{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int arr[]={1,1,1};
        int k=2;
        int ps=0;int c=0;
        for(int i =0;i<arr.length;i++){
            ps+=arr[i];
            if(map.containsKey(ps-k)){
            c+=map.get(ps-k);
            }
            
            map.put(ps,map.getOrDefault(ps,0)+1);
            
            }
            System.out.println(c);
        }

    }
