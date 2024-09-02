package Week2.Searching;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,5,5,5};
        int val=5;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>val){
                high=mid-1;
            }
            else if(arr[mid]<val){
                low=mid+1;
            }
            else{
                if(arr[mid]==val && arr[mid-1]!=val){
                    System.out.println(mid);
                    return;
                }
                else{
                    high=mid-1;
                }
            }
        }
    }
}
