import java.util.*;
public class Recursion_Subsequence {
    public static void subsequence(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char curr=str.charAt(idx);
     //choice to be a part of the subsequence
        subsequence(str,idx+1,newString+curr);
        //choice of not to be
        subsequence(str,idx+1,newString);
    }
    public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
subsequence(str,0,"");
    }
}
