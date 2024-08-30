package Week2.Arrays;

public class LeadersArray {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5,6,9,3,2,1};
        int n=arr.length-1;
        int leader=arr[n];
        System.out.println(leader);
        for(int i=n-1;i>0;i--){
            if(arr[i]>leader){
                leader=arr[i];
                System.out.println(leader);
            }
        }
    }
}
