import java.util.*;

public class Main {
    public static void twosum(int[] arr, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int val=target-arr[i];
            if(map.containsKey(val)){
               System.out.println(map.get(val)+" "+i);
               return;
            }
            map.put(arr[i],i);
        }
        System.out.println(-1+" "+-1);
    }
    public static void main(String args[]){
        int arr[]={1,3,5,7,9,13,15};
        int target=21;
        twosum(arr,target);

    }
    
}
