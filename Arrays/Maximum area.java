public class twopointer{
    public static void main(String args[]){
        int arr[]={1, 8, 6, 2, 5, 4, 8, 3, 7};
        int right=arr.length-1;
        int left=0;
        int max_area=0;
        while(left<right){
            int min_height=Math.min(arr[right],arr[left]);
            int width=right-left;
            int area=width*min_height;
            max_area=Math.max(area,max_area);
            if(arr[left]<arr[right])  left++;
            else right--;
        }
        System.out.println(max_area);
    }
}
