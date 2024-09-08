package Week3.Sorting;

import java.util.Arrays;

//It takes less memory write but not stability
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,4,3,3,5,2,6};
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
