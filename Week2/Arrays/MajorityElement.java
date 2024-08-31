package Week2.Arrays;

//Boyer-Moore Majority Voting Algorithm
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3, 3, 4, 2, 4, 4, 2, 4, 4};
        int res=0;
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        System.out.println(res);
        count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }

        }
        if(count>arr.length/2){
                System.out.println(arr[res]);
        }
    }
}
