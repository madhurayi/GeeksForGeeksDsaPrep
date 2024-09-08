package Week3.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void bucketSort(int[] arr, int k){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        max++;
        System.out.println(max);
        ArrayList<ArrayList<Integer>> bucket= new ArrayList<>();
        for(int i=0;i<k;i++){
            bucket.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            int bi=(k*arr[i])/max;
            bucket.get(bi).add(arr[i]);
        }
        System.out.println(bucket.toString());
        for(int i=0;i<bucket.size();i++){
            Collections.sort(bucket.get(i));
        }
        System.out.println(bucket.toString());
        int index=0;
        for(int i=0;i<bucket.size();i++){
            for(int j=0;j<bucket.get(i).size();j++){
                arr[index]=bucket.get(i).get(j);
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr={20,88,10,85,75,95,18,82,60};
        bucketSort(arr, 4);
    }
}
