package Week3.Matrix;

public class SearchInRowWiseColumnWiseSorted {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int row=arr.length,col=arr[0].length;
        int i=0;
        int j=col-1;
        int val=21;
        while(i<row && j>=0){
            if(arr[i][j]==val){
                System.out.println("Value is present");
                return;
            }
            else if(arr[i][j]>val){
                j--;
            }
            else if(arr[i][j]<val){
                i++;
            }
        }
        System.out.println("value not found");
    }
}
