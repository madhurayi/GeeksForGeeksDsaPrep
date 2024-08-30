package Week2.Arrays;

import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,4,4,4};
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[res]!=arr[i]){
                res++;
                arr[res]=arr[i];              
            }
        }
        System.out.println(Arrays.toString(arr)+" "+res);
    }
}
