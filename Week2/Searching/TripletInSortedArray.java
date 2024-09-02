package Week2.Searching;

public class TripletInSortedArray {
    public static boolean twoPointersApproach(int[] arr,int target,int i){
        int low=i,high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]==target){
                System.out.println(true);
                return true;
            }
            else if(arr[low]+arr[high]>target){
                high--;
            }else{
                low++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={2,5,10,15,18};
        int val=36;
        for(int i=0;i<arr.length-2;i++){
            twoPointersApproach(arr,val-arr[i] , i+1);
        }
        System.out.println(false);
    }
}
