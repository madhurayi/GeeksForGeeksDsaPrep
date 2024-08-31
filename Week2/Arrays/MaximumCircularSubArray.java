package Week2.Arrays;

public class MaximumCircularSubArray {
    public static int normalSubArray(int[] arr){
        int maxLength=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            maxLength=Math.max(maxLength+arr[i],arr[i]);
            res=Math.max(maxLength, res);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={10, -3, -4, 7, 6, 5, -4, -1} ;
        int nrmlSum=normalSubArray(arr);
        if(nrmlSum<0)
        {
            System.out.println(nrmlSum);
            return;
        }
        int arrSum=0;
        int maxCircular=0;
        for(int i=0;i<arr.length;i++ ){
            arrSum=arrSum+arr[i];
            arr[i]=-arr[i];
        }
        maxCircular=arrSum+normalSubArray(arr);

        System.out.println(Math.max(maxCircular,nrmlSum));
    }
}
