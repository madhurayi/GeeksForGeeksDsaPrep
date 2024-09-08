package Week3.Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr={1,4,1,2,7,5,2};
        int k=7;
        int[] count=new int[k+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]=count[i-1]+count[i];
        }
        int[] output=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<output.length;i++){
            arr[i]=output[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
