package Week3.Sorting;

import java.util.Arrays;

public class SortingWithTwoTypesOfElements {
    public static void main(String[] args) {
        int[] arr= {10,-1,2,-3,6,-9,-7};
        int n=arr.length;
        int i=-1;
        int j=n;
        while(true){
            do{
                i++;
            }while(arr[i]<0);
            do{
                j--;
            }while(arr[j]>=0);
            if(i>j){
                System.out.println(Arrays.toString(arr));
                return;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            System.out.println(arr[i]+" "+arr[j]);
        }
        
    }
}
