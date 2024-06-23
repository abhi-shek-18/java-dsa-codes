import java.util.*;
public class Recursion_xAtEnd {
    public static void shiftX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            while(count!=0){
                newString+='x';
                count--;
            }
            System.out.println(newString);
            return;
        }
        char curr=str.charAt(idx);
        if(curr=='x'){
            count++;
            shiftX(str,idx+1,count,newString);
        }
        else{
            newString+=curr;
            shiftX(str,idx+1,count,newString);
        }

    }
    public static void main(String args[]){
Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        shiftX(str,0,0,"");
    }
}
