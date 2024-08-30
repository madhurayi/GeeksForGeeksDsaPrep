package Week2.Arrays;

import java.util.Arrays;

public class ZeroesToEnd {
    public static void main(String[] args) {
        int[] arr={2,1,3,0,0,1,0,4};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
