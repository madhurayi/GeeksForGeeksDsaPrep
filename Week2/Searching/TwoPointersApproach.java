package Week2.Searching;

public class TwoPointersApproach {
    public static void main(String[] args) {
        int[] arr = {2,5,8,9,11,12,30};
        int target=31;
        int low=0,high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]==target){
                System.out.println(true);
                return;
            }
            else if(arr[low]+arr[high]>target){
                high--;
            }else{
                low++;
            }
        }
        System.out.println(false);
    }
}
