public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int num=60;
        int res=0;
        for(int i=5;i<=num;i=i*5){
            System.out.println(res+" "+num);
            res=res+num/i;
        }
        System.out.println(res);
    }
}
