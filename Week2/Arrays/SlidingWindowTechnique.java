package Week2.Arrays;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int[] arr={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        int res=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum=maxSum+arr[i];
        }
        res=maxSum;
        for(int i=k;i<arr.length;i++){
            maxSum=maxSum-arr[i-k]+arr[i];
            res=Math.max(maxSum, res);
        }
        System.out.println(res);
    }
}
