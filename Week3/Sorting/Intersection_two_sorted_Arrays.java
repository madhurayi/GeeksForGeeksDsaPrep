package Week3.Sorting;

/**
 * Intersection_two_sorted_Arrays
 */
public class Intersection_two_sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1= {10,20,20,20,60};
        int[] arr2={2,20,20,20};
        int l1=arr1.length;
        int l2=arr2.length;
        int i=0,j=0;
        while(i<l1 && j<l2){
            if(i>0 && arr1[i]==arr1[i-1] ){
                i++;
                continue;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                System.out.println(arr1[i]);
                i++;j++;
            }
        }
    }
    
}