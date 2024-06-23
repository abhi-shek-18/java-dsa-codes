import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String args[]){
        //creation
        HashSet<Integer>set=new HashSet<>();

        //Insertion  ->O(1)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        System.out.println("Size of the set: "+ set.size());
        //Searching  ->O(1)
        if(set.contains(3)){
            System.out.println("Set contains 3");
        }
        if(!set.contains(5)){
            System.out.println("Does not contain");
        }

        //Deletion  ->O(1)
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Set does not contain 1 ..we deleted it");
        }

        //set does not have index value so we can traverse in set using iterator

        //Iterator  ->Contains two function
        //hasNext->it returns either true or false
        //next->it returns the next value in the set
        Iterator it= set.iterator();
       for(int i=0;i< set.size();i++){
           System.out.print(it.next()+"\n");
           System.out.println("Set contains next value:"+it.hasNext());
       }


    }
}
