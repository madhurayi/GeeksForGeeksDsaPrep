package Week2.Searching;

public class SearchInSortedRotatedArray {
    public static int searchRotatedArray(int[] arr, int val){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==val){
                return mid;
            }
            else if(arr[low]<arr[mid]){
                if(val>arr[low] && val<arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(val>arr[mid] && val<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,40,60,5,8};
        int val=8;
       System.out.println(searchRotatedArray(arr, val));

    }
}
