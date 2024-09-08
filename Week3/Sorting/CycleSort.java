package Week3.Sorting;

import java.util.Arrays;

/**
 * CycleSort
 */
public class CycleSort {
    public static void cycleSort(int[] arr){
        int n=arr.length;
        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int ps=cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i]<item){
                    ps++;
                }
            }
            int temp=arr[ps];
            arr[ps]=item;
            item=temp;
            while(ps!=cs){
                ps=cs;
                for(int i=cs+1;i<n;i++){
                    if(arr[i]<item){
                        ps++;
                    }
                }
                int temp1=arr[ps];
                arr[ps]=item;
                item=temp1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={20,10,50,40,30};
        cycleSort(arr);
    }
}
