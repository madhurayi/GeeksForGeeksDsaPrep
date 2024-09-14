package Week3.Hashing;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr={10,20,10,30,40,40};
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}
