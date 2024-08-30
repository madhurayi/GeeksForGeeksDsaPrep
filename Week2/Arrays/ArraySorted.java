package Week2.Arrays;

public class ArraySorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        int flg=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                flg=0;
                break;
            }               
        }
        if(flg==0)
            System.out.println("Array is not sorted");
        else   
            System.out.println("Array is  sorted");
    }
}
