package Week3.Sorting;

import java.util.Arrays;

public class SortingWithThreeTypesOfElements {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,0,1,2,2,1,1};
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
    }
}
