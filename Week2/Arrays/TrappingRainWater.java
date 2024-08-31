package Week2.Arrays;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr={3, 0, 2, 0, 4};
        int n=arr.length;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        int i=0;
        leftMax[i]=arr[0];
        for( i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1], arr[i]);
        }
        System.out.println(Arrays.toString(leftMax));
        rightMax[n-1]=arr[n-1];
        for( i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], arr[i]);
        }
        System.out.println(Arrays.toString(rightMax));
        int res=0;
        for(i=1;i<n-1;i++){
            res=res+Math.min(leftMax[i],rightMax[i])-arr[i];
        }
        System.out.println(res);
    }
}
