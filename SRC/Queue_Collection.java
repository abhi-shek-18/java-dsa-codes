import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Collection {
    public static void main(String args[]){
//        Queue_List.Queue q=new Queue_List.Queue();
        //we can't select queue because queue is an interface
        // and objects can only be created for the classes
//        Queue<Integer>q=new LinkedList<>();
        Queue<Integer>q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
