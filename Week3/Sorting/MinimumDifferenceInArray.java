package Week3.Sorting;

import java.util.Arrays;

public class MinimumDifferenceInArray {
    public static void main(String[] args) {
        int[] arr={1,8,12,5,18,1};
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min=Math.min(min, arr[i]-arr[i-1]);
        }
        System.out.println(min);
    }
}
