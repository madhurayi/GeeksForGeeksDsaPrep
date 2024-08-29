public class Divisors {
    public static void main(String[] args) {
        int num=15;
        int i;
        for( i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){
            if(num%i==0)
                System.out.println(num/i);
        }
    }
}
