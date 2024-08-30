package Week2.Arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr= {7, 9, 5, 6, 3, 2};
        int res=arr[1]-arr[0];
        int min=0;
        for(int i=1;i<arr.length;i++){
           if(arr[i]-arr[min]>res){
            res=arr[i]-arr[min];
            // System.out.println(res);
           }
           if(arr[i]<arr[min]){
            min=i;
            // System.out.println(arr[min]);
           }
        }
        System.out.println(res);
    }
}
