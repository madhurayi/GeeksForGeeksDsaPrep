package Week2.Arrays;

public class StockBuyAndSellNaiveApproach {
    public static int maxProfit(int[] arr,int start, int end){
        if(end<=start)
            return 0;
        int profit=0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int cur_profit= (arr[j]-arr[i])+maxProfit(arr, start,i-1 )+maxProfit(arr, j+1, end);
                    profit=Math.max(profit,cur_profit);
                }
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr={100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit(arr, 0, arr.length-1));
    }
}
