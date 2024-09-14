package Week3.Hashing;

import java.util.HashSet;

public class SubArrayWithGuvenSUm {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,8};
        int sum = 16;
        HashSet<Integer> hs= new HashSet<>();
        int prefixSum=0;
        for(int i=0;i<arr.length;i++){
            prefixSum=prefixSum+arr[i];
            if(hs.contains(prefixSum-sum)){
                System.out.println("present");
                return;
            }
            if(prefixSum==sum){
                System.out.println("Present");
                return;
            }
            else{
                hs.add(prefixSum);
            }
        }
    }
}
