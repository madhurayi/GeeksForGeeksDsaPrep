package Week3.Matrix;

import java.util.Arrays;

public class Rotate90DegAntiClockWise {
    public static void main(String[] args) {
         int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        for(int i=0;i<r;i++){
            int low=0,high=r-1;
            while(low<=high){
                int temp=arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp;
                low++;
                high--;
            }
        }
    }
}
