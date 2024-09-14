package Week3.Hashing;

import java.util.HashSet;
import java.util.Set;

public class Union_of_Unsorted_Arrays {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        int[] arr2={10,40};
        Set<Integer> hs= new HashSet<>();
        for(int i : arr){
            hs.add(i);
        }
        for(int i : arr2){
            hs.add(i);
        }
        System.out.println(hs);
    }
}
