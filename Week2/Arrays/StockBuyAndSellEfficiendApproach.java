package Week2.Arrays;

public class StockBuyAndSellEfficiendApproach {
    public static void main(String[] args) {
        int[] arr={100, 180, 260, 310, 40, 535, 695};
        int profit=0;
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>arr[i-1]){
                profit=profit+arr[i]-arr[i-1];
            }
        }
        System.out.println(profit);
    }
}
