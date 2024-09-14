package Week3.Hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequencies_of_ArrayElements {
     public static void main(String[] args) {
        int[] arr={10,20,10,30,40,40};
        HashMap<Integer,Integer> hs= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : hs.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
