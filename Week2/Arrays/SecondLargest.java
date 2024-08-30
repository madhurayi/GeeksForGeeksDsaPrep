package Week2.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,5,4,3,2,0};
        int largest=0;
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        System.out.println(res);
    }
}
