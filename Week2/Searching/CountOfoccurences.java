package Week2.Searching;

public class CountOfoccurences {
    public static int firstOccurence(int[] arr,int val){
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
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static int lastOccurence(int[] arr, int val){
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
                if(( mid==arr.length-1 || arr[mid+1]!=arr[mid] )){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5,5,5,6};
        int val=5;
        int firstCount=firstOccurence(arr, val);
        if(firstCount<0){
            System.out.println("Not Present");
        }else{
            System.out.println(lastOccurence(arr, val)-firstCount+1);
        }
    }
}
