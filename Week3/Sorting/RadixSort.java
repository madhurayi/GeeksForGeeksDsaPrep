package Week3.Sorting;

import java.util.Arrays;

public class RadixSort {
    public static void countingSort(int[] arr,int exp){
        int n=arr.length;
        int count[]= new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];

        }
        int[] output= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int exp=1;max/exp>0;exp=exp*10){
            countingSort(arr,exp);
        }
    }
    public static void main(String[] args) {
        int[] arr={170,45,75,90,802,24,2,66};
        radixSort(arr);
    }
}
