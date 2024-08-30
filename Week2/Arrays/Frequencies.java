package Week2.Arrays;

public class Frequencies {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,4,5,6,7};
        int i=1;
        int n=arr.length;
        int freq=1;
        while(i<n){
            freq=1;
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+" "+1);
        }
    }
}
