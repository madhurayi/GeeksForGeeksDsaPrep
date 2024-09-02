package Week2.Searching;

public class BinarySearch {
    public static void binarySearch(int[] arr,int val,int low, int high){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==val) {
                System.out.println("Present");
                return;
            }
            else if(arr[mid]>val){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Not Present");
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,5};
        int val=5;
        binarySearch(arr, val,0,arr.length-1);
    }
}
