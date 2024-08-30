package Week2.Arrays;

import java.util.Arrays;

public class LeftRotateArrayDPlaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=3;
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));
        for(int i=0;i<arr.length-d;i++){
            arr[i]=arr[d+i];
        }
        System.out.println(Arrays.toString(arr));
        int i=0;
        for(int j=arr.length-d;j<arr.length;j++){
            arr[j]=temp[i];
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
