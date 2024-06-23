import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {

    public static void main(String args[]){
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(5);
        System.out.println(list1);
        int elem=list1.get(0);
        System.out.println("Element at index 0: "+elem);

        //set element
        list1.set(0,1);
        System.out.println(list1);

        //remove element
        list1.remove(0);
        System.out.println(list1);
        //sorting
        Collections.sort(list1);
    }
}
