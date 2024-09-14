package week4.strings;

public class Polindrome {
    public static void main(String[] args) {
        String pol= "madhuuhdam";
        int low=0;
        int high=pol.length()-1;
        while(low<high){
            if(pol.charAt(low)!=pol.charAt(high)){
                System.out.println("Not polindrome");
                return;
            }
            low++;
            high--;
        }
        System.out.println("Polindrome");
    }
}
