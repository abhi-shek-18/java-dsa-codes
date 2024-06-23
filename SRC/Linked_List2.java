//Linked list by Collection framework
import java.util.*;
public class Linked_List2 {

    public static void main(String args[]){
        LinkedList<String>list=new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("Language");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");
        list.removeFirst();
        System.out.println(list);
    }
}
