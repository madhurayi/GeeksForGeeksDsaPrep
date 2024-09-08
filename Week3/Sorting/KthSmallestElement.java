package Week3.Sorting;

public class KthSmallestElement {
    public static int QuickSort(int[] arr,int low,int high,int k){
        while(low<=high){
            int p=Partition(arr, low, high);
            if(p==k-1){
                return arr[p];
            }
            else if(p>k-1){
                high=p-1;
            }else{
                low=p+1;
            }
        }
        return -1;
    }
    public static int Partition(int[] arr, int low,int high){
        int p=arr[high];
        int i=low-1;
        while(low<high){
            if(arr[low]<p){
                i++;
                int temp=arr[i];
                arr[i]=arr[low];
                arr[low]=temp;
            }
            low++;
        }
        i++;
        int temp=arr[i];
        arr[i]=p;
        arr[high]=temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,6,7,9};
        System.out.println(QuickSort(arr, 0, arr.length-1, 3));
    }
}
