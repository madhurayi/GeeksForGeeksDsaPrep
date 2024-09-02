package Week2.Searching;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr={5,20,40,30,20,50,60};
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || (arr[mid-1]<=arr[mid])) && (mid==arr.length-1 || (arr[mid+1])<=arr[mid])){
                System.out.println(mid);
                return;
            }
            else{
                if(arr[mid-1]>=arr[mid] && mid>0){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
    }
}
