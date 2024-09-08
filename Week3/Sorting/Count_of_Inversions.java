package Week3.Sorting;

public class Count_of_Inversions {
    public static int countInversions(int[] arr,int low,int high){
            int res=0;
            if(low<high){
                int mid=(low+high)/2;
                res=res+countInversions(arr, low, mid);
                System.out.println("--"+res);
                res=res+countInversions(arr, mid+1, high);
                System.out.println(".."+res);
                res=res+countAndMerge(arr,low,mid,high);
            }
            return res;
    }
    public static int countAndMerge(int[] arr, int low, int mid, int high){
        int[] arr1=new int[mid-low+1];
        int[] arr2=new int[high-mid];
        int res=0,k=0;
        for(int i=0;i<mid-low+1;i++){
            arr1[i]=arr[low+i];
        }
        for(int i=0;i<high-mid;i++){
            arr2[i]=arr[mid+i+1];
        }
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                k++;
                i++;
            }
            else if(arr1[i]>arr2[j]){
                arr[k]=arr2[j];
                j++;
                k++;
                res=res+arr1.length-i;
            }
        }
        while(i<arr1.length){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={5,2,8,11,6,3,9,13};
        System.out.println(countInversions(arr, 0, arr.length-1));

    }
}
