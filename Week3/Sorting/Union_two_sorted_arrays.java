package Week3.Sorting;

public class Union_two_sorted_arrays {
    public static void main(String[] args) {
        int[] arr1={2,10,20,20};
        int[] arr2={3,20,40};
        int l1=arr1.length,l2=arr2.length;
        int i=0,j=0;
        while(i<l1 && j<l2){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            else if(j>0 && arr1[j]==arr2[j-1]){
                j++;
                continue;
            }
            else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
        while (i<l1) {
            if(i>0 && arr1[i]!=arr1[i-1]){
                System.out.print(arr1[i]+" ");
            }
            i++;
        }
        while (j<l2) {
            if(j>0 && arr2[j]!=arr2[j-1]){
                System.out.print(arr2[j]+" ");
            }
            j++;
        }
    }
}
