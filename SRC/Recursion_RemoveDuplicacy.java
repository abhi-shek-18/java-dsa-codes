import java.util.*;
public class Recursion_RemoveDuplicacy {
    public static boolean[] map=new boolean[26];

    public static void remDuplicates(String str,int idx,String newString){
       if(idx==str.length()){
           System.out.println(newString);
           return;
       }

        char curr=str.charAt(idx);
        if(map[curr-'a']==true){
            remDuplicates(str,idx+1,newString);
        }else{
            newString+=curr;
            map[curr-'a']=true;
            remDuplicates(str,idx+1,newString);
        }
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
remDuplicates(str,0,"");
    }
}
