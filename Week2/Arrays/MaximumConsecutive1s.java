package Week2.Arrays;

public class MaximumConsecutive1s {
    public static void main(String[] args) {
        int[] arr={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int n= arr.length;
        int count=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count=0;
            }else{
                count++;
                res=Math.max(res, count);
            }
        }
        System.out.println(res);
    }   
}
