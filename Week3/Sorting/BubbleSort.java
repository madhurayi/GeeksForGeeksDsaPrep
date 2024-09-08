package Week3.Sorting;

import java.util.Arrays;

//It is a stability sorting
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,4,5,5,6,1};
        boolean swapFlag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapFlag=true;
                }
            }
            if(swapFlag==false){
                return;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
