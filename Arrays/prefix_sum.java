public class prefix_sum{
  public static void main(String args[]){
    int arr[]={1, 7, 3, 6, 5, 6};
    int left=0;
    int right=0;
    int total=0;
    for(int num:arr){
      total+=num;
    }
    for(int i=0;i<arr.length;i++){
      right=total-left-arr[i];
      if(left == right) {
        System.out.println(i);
          return;
      }
      left+=arr[i];
    }
    System.out.print(-1);
  }}
      
