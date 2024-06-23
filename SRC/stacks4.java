import java.util.Stack;
public class stacks4 {
    //push the element at the bottom of the stack
    public static void pustBottom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pustBottom(data,s);
        s.push(top);
    }

    //reverse the stack
    public static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }

        int top=s.pop();
        reverse(s);
        pustBottom(top,s);
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
//        pustBottom(4,s);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
