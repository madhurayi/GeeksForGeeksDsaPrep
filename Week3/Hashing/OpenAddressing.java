package Week3.Hashing;

class Hashing{
    int[] arr;
    int cap,size;
    Hashing(int cap){
        this.cap=cap;
        size=0;
        arr=new int[cap];
        for(int i=0;i<cap;i++){
            arr[i]=-1;
        }
    }
    int hash(int key){
        return key%cap;
    }
    boolean search(int key){
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                return true;
            }
            i=(i+1)%cap;
            if(i==h){
                return false;
            }
        }
        return false;
    }
    boolean insert(int key){

        int h=hash(key);
        int i=h;
        if(size==cap){
            return false;
        }
        while(arr[i]!=-1 && arr[i]!=key && arr[i]!=-2){
            i=(i+1)%cap;
        }
           if(arr[i]==key){
                return false;
           }
           else{
            arr[i]=key;
            size++;
            return true;
           }
    }
    boolean erase(int key){

        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            
           if(arr[i]==key){
                arr[i]=-1;
                return true;
           }
           i=(i+1)%cap;
           if(i==h){
                return false;
           }

        }
        return false;
    }


}
public class OpenAddressing {
    public static void main(String[] args) {
        Hashing h= new Hashing(7);
        System.out.println(h.insert(10));
        System.out.println(h.insert(11));
        System.out.println(h.erase(10));
        System.out.println(h.erase(11));
        

    }
}
