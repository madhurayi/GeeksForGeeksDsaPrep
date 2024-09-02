package Week2.Searching;

public class Count1sBinaryArray {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,1,1,1,1};
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0){
                low=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]==0){
                    System.out.println(arr.length-mid);
                    return;
                }else{
                    high=mid-1;
                }
            }
        }
    }
}
