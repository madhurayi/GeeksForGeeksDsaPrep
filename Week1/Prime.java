public class Prime {
    public static void main(String[] args) {
        int num=7;
        int flg=1;
        for(int i=3;i*i<num;i++){
            if(num%i==0){
               flg=0;
                break;
            }
        }
        if(flg==1)  System.out.println(true);
        else  System.out.println(false);
    }
}
