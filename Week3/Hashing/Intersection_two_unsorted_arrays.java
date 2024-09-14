package Week3.Hashing;

import java.util.HashSet;

public class Intersection_two_unsorted_arrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,5,4};
        int[] arr2={3,5,4};
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        for(int i=0;i<arr1.length;i++){
            if(hs.contains(arr1[i]))
                System.out.println(arr1[i]);
        }
    }
}
