import java.util.*;
public class StringBuilders {
    public static void main(String args[]){
        StringBuilder str=new StringBuilder("Hello");

        //char at index 1
        System.out.println(str.charAt(1));

        //set char at index 3
        str.setCharAt(3,'p');
        System.out.println(str);

        //insertion in string
        str.insert(0,"world");
        System.out.println(str);

        //delete the p
        str.delete(3,4);
        System.out.println(str);

        //append
        str.append("1");
        System.out.println(str);


    }
}
