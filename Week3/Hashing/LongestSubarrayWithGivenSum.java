package Week3.Hashing;

import java.util.*;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={5,2,3};
        int sum=5;
        int n=arr.length;
        int prefixSum=0,res=0;
        Map<Integer, Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            prefixSum=prefixSum+arr[i];
            System.out.println(prefixSum);
            if(prefixSum==sum){
                res=i+1;
            }
            if(hm.containsKey(prefixSum)==false){
                hm.put(prefixSum, i);
            }if(hm.containsKey(prefixSum-sum)){
                res=Math.max(res, i-hm.get(prefixSum-sum));
            }

        }
        System.out.println(res);

    }
}
