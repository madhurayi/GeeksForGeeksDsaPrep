package Week2.Arrays;

// Kadanes Algorithm
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
        int n=arr.length;
        int maxEnding=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(maxEnding,res);
        }
        System.out.println(res);
    }
}
