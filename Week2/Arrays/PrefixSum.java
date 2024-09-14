package Week2.Arrays;

import java.util.Arrays;

public class PrefixSum {
    static int[] arr={10, 20, 10, 5, 15};
     static int[] prearr=new int[arr.length];
    public static int getSum(int l, int r){
        if(l==0) return prearr[r];
        else return prearr[r]-prearr[l-1];
    }
    public static void main(String[] args) {
        prearr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prearr[i]=prearr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prearr));
        System.out.println(getSum(1, 3));
    }
}
