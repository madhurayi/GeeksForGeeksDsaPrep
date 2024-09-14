package Week3.Hashing;
import java.util.*;

public class LongestConsecutiveSubSequence {
    public static void main(String[] args) {
        int[] arr= {2,1,3,6,8,9};
        Set<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int res=0;
        for(Integer i : hs){
            if(hs.contains(i-1)==false){
                int count=1;
                while(hs.contains(i+count)){
                    count++;
                }
                res=Math.max(res,count);
            }
        }
        System.out.println(res);
    }
}
