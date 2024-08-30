package Week2.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,9,10};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
