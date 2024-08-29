public class Polindrome {
    public static void main(String[] args) {
        int num=1312;
        int rev=0;
        int temp=num;
        while(temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
