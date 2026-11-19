import java.util.*;
public class Main {
    public static void main(String args[]){
        int arr[]={1,-2,3,-6,5,7,9,-1,13,15,-10};
        int cur_sum=0;
        int max_sum=arr[0];
        for(int num:arr){
            cur_sum=Math.max(0,cur_sum+num);
            max_sum=Math.max(max_sum,cur_sum);
          }
        System.out.println(max_sum);
        
    }
    
}
