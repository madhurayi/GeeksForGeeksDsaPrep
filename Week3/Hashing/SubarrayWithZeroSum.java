package Week3.Hashing;

import java.util.HashSet;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr={3,2,1,-4,3,6};
        HashSet<Integer> hs= new HashSet<>();
        int prefixSum=0;
        for(int i=0;i<arr.length;i++){
            prefixSum=prefixSum+arr[i];
            if(hs.contains(prefixSum)){
                System.out.println("present");
                return;
            }
            if(prefixSum==0){
                System.out.println("Present");
                return;
            }
            hs.add(arr[i]);
        }
        System.out.println("Not present");
    }
}
