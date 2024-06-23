//insertion:O(1)
//Searching:O(n)
import java.util.*;
public class Linked_List1 {
    Node head;
    private int size;
    Linked_List1(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

//Add- first,Last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
    }

    //printing Linked list
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    //Delete at first
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

    public void deletLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
       }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }

    public void reverseIterateList(){
        if(head==null|| head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;


            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public Node reverseRecurseList(Node head){
        if(head==null ||head.next==null){
            return head;
        }
        Node newHead=reverseRecurseList(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }

    //Delete the nth node from last
    //if n=2 from last then from starting it would be (size-n+1)
    public Node DeleteGivenNode(Node head,int n){
        if(head.next==null){
            return null;
        }
        Node currNode=head;
        int size=0;
        while(currNode!=null){
            currNode=currNode.next;
            size++;
        }
        if(n==size){
            return head.next;
        }

        int Search_index=size-n;
        Node prev=head;
        int i=1;
        while(i<Search_index){
            prev= prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }

public Node findMiddle(Node head){
        Node hare=head;
        Node turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;  // takes two step at a time
            turtle=turtle.next;  //takes one step at a time and gives the middle value

        }
        return turtle;
}
    public boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }

        Node middle_Node=findMiddle(head);  //first half's end
        Node secondHalfStart=reverseRecurseList(middle_Node.next);

        Node firsHalfStart=head;
        while(secondHalfStart!=null){
            if(firsHalfStart.data != secondHalfStart.data){
                return false;
            }
            firsHalfStart=firsHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }

    //check if there is a loop in a linked list or not
    //by hare and turtle method when they meet at the same point then there is a loop
    public boolean hasCycle(Node head){
        if(head==null){
            return false;
        }
        Node hare=head;
        Node turtle=head;

        while(hare!=null && hare.next!=null ){
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare==turtle){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        Linked_List1 list=new Linked_List1();
        list.addFirst("a");
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("1");
        list.addLast("Programming");
        list.addFirst("Python");
        list.printList();
        System.out.println("After deletion");
        list.deleteFirst();
        list.printList();
        list.deletLast();
        list.printList();
        int size= list.getSize();
        System.out.println("size of Linked list: "+size);
        System.out.println("Reversing the linked list:");
        list.reverseIterateList();
        list.printList();
        list.head=list.reverseRecurseList(list.head);
        list.printList();
        list.DeleteGivenNode(list.head,2);
        list.printList();
        System.out.println("Check if linked list is Palindrome:");
        boolean res= list.isPalindrome(list.head);
        System.out.println(res);
        boolean ans= list.hasCycle(list.head);
        System.out.println("Checking for cyclic Linked list:");
        System.out.println(ans);
    }
}
