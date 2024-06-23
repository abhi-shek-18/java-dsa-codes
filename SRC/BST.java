import java.util.ArrayList;

public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    //Insertion
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left,val);
        }
        else{
            //right subtree
            root.right=insert(root.right,val);
        }
        return root;
    }

    //Searching in BST   :O(h)
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(key==root.data){
            return true;
        }
        else if(key<root.data){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }

    //Delete a node
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }

        else{
            //case 1
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.right;
            }

            //case 3
            Node IS=inOrderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //print the nodes in range
    //if x<root<y -> traverse both left and right subtree
    //if x>root ->then traverse on right subtree only
    //if y<root ->then traverse on the left subtree only

    public static void printInRange(Node root,int x,int y){
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
            printInRange(root.right,x,y);
        }
        else if(root.data>=y){
            printInRange(root.left,x,y);
        }
        else{
            printInRange(root.right,x,y);
        }
    }

    //path to leaf node
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printLeafRoute(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        //leaf node condition
        if(root.left==null && root.right==null){
            printPath(path);
        }else{
            printLeafRoute(root.left,path);
            printLeafRoute(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        int values2[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        Node root2=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        System.out.println("Created Binary tree is: ");
        inOrder(root);
        int key=6;
        System.out.print("\n"+key+" is present in tree: ");
        System.out.println(search(root,key));
        int val=2;
        delete(root,val);
        System.out.println("Created Binary tree is: ");
        inOrder(root);
        int x=6;
        int y=10;
        for(int i=0;i<values2.length;i++){
            root2=insert(root2,values2[i]);
        }

        System.out.println("\nPrinting the nodes in range "+x+" and "+y+" :");
//        inOrder(root2);
        printInRange(root2,x,y);

        ArrayList<Integer>path=new ArrayList<>();
        System.out.println("\nPath to leaf Node are: ");
        printLeafRoute(root,path);
    }
}