package Week2.Arrays;

public class MaximumEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 7, 9} ;
        int n=arr.length;
        int maxLength=1;
        int res=0;
        for(int i=1;i<n;i++){
            if((arr[i-1]%2==0 && arr[i]%2!=0) ||
                 (arr[i-1]%2!=0 && arr[i]%2==0)){
                    maxLength++;
                    res=Math.max(maxLength, res);
                }
                else{
                    maxLength=1;
                }
                 
        }
        System.out.println(res);
    }
}
