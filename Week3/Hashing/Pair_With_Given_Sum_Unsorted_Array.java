package Week3.Hashing;

import java.util.HashSet;

public class Pair_With_Given_Sum_Unsorted_Array {
    public static void main(String[] args) {
        int[] arr={2,6,7,1};
        int sum=4;
        HashSet<Integer> hs= new HashSet<>();
        for(int i : arr){
            if(hs.contains(sum-i)){
                System.out.println(i+" "+(sum-i));
                return;
            }
            else{
                hs.add(i);
            }
        }
        System.out.println("Not found");
    }
}
