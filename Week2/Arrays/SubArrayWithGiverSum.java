package Week2.Arrays;

public class SubArrayWithGiverSum {
    public static void main(String[] args) {
        int[] arr={1, 4};
        int s=0;
        int sum=0;
        int maxSum=arr[0];
        for(int e=1;e<arr.length;e++){
            maxSum=maxSum+arr[e];
            while (sum<maxSum && s<e-1) {
                maxSum=maxSum-arr[s];
                s++;
            }
            if(maxSum==sum){
                System.out.println("true");
                return;
            }
        }
        System.out.println("False");
    }
}
