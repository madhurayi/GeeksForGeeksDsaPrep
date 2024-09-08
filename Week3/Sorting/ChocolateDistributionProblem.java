package Week3.Sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int[] arr={1,9,12,18,22,3,30};
        int n=arr.length;
        int m=3;
        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];
        for(int i=1;i+m-1<n;i++){
            res=Math.min(res, arr[i+m-1]-arr[i]);
        }
        System.out.println(res);
    }
}
