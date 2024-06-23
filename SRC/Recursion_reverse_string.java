import java.util.*;
public class Recursion_reverse_string {
    //reverse the string with the index variable as idx=length-1
    public static void reverse(String str,int size){
        int idx=size-1;
        if(idx<0){
            return;
        }
        System.out.println(str.charAt(idx));
        reverse(str,idx);
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length();
        reverse(str,len);
    }
}
