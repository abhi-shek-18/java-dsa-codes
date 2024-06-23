import java.util.*;
public class Recursion_element_occurance {
    //find the 1st and last occurance of an element in string
    public static int first=-1;
    public static int last=-1;
    public static void Occur(String str,int idx,char elem){
        if(str.length()==idx){
            System.out.println("First Occurence of "+elem+" at:"+first);
            System.out.println("Last Occurence of "+elem+" at:"+last);
            return;
        }

        char curr=str.charAt(idx);
        if(curr==elem){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
            Occur(str, idx + 1, elem);
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char elem='a';
        Occur(str,0,elem);
    }
}
