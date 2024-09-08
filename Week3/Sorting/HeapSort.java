package Week3.Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void maxHeapify(int[] arr,int n, int i){
        int largest=i;
        int left= 2*i+1;
        int right=2*i+2;
        if(left<n && arr[largest]<arr[left]) largest=left;
        if(right<n && arr[largest]<right) largest=right;
        if(largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            maxHeapify(arr, n, largest);
        }
    }
    public static void buildMaxHeap(int[] arr){
        int n=arr.length;
        for(int i=(n-2)/2;i>=0;i--){
            maxHeapify(arr, n, i);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,10,3,5,1};
        int n=arr.length;
        buildMaxHeap(arr);
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxHeapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));
    }
}
