package week4.strings;

public class FrequenciesOfCharacter {
    public static void main(String[] args) {
        String name="madhupriya";
        int[] count=new int[26];
        for(int i=0;i<name.length();i++){
            count[name.charAt(i)-'a']++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a')+" "+count[i]);
            }
           
        }
    }
}
