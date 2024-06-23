import java.util.*;
public class Strings1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String name=s.next();
        String fullName=s.nextLine();
        System.out.println("FUll Name length: "+fullName.length());
        System.out.println("First Name: "+name);
        System.out.println(name.charAt(2));
        String str1="Abhi";
        String str2="abhi";
        // .compareto if >1 then positive value
        //if<1 then negative value.
        if(str1.compareTo(str2)==0){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal.");
        }
        System.out.println(fullName.substring(3,10));
    }
}
