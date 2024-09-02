package Week2.Searching;

public class SquareRoot {
    public static int squareRoot(int num){
        int low=1;int high=num;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int sqrt= mid*mid;
            if(sqrt==num){
                return mid;
            }
            else if(sqrt>num){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int num=16;
        System.out.println(squareRoot(num));
    }
}
