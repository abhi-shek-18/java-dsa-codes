import java.util.*;
public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class Btree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);

            return newNode;
        }

    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    //Level order traversal by using queue
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null); //for indicating the new line after each level

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();  //for nextline
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //count of nodes
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNode=countNodes(root.left);
        int rightNode=countNodes(root.right);

        return leftNode+rightNode+1;
    }

    //sum of nodes
    public static int sumNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumNodes(root.left);
        int rightsum=sumNodes(root.right);

        return leftsum+rightsum+root.data;
    }

    //height of the tree
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        int maxHeight=Math.max(leftHeight,rightHeight)+1;
        return maxHeight;
    }

    //First Approach:finding diameter of the tree including root node
    //It takes O(n^2) time
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }

    //Second Approach: By storing the height and diameter value of each node separately
    //It takes O(n)
    static class TreeInfo{
        int ht;
        int dm;

        TreeInfo(int ht,int dm){
            this.ht=ht;
            this.dm=dm;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root==null){
           return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);

        int maxHeight=Math.max(left.ht,right.ht)+1;

        int dm1=left.dm;
        int dm2=right.dm;
        int dm3=left.ht+right.ht+1;

        int myDiam=Math.max(Math.max(dm1,dm2),dm3);

        TreeInfo myInfo=new TreeInfo(maxHeight,myDiam);
        return myInfo;

    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //preorder sequence
        Btree tree=new Btree();
       Node root= tree.buildtree(nodes);
//        System.out.println(root.data);
        System.out.println("PreOrder traversal of tree:");
        preOrder(root);
        System.out.println("\nInOrder traversal of the tree:");
        inOrder(root);
        System.out.println("\nPostOrder traversal of the tree:");
        postOrder(root);
        System.out.println("\nLevelOrder traversal of the tree:");
        levelOrder(root);
        System.out.println("\nNumber of nodes in tree:");
        System.out.println(countNodes(root));
        System.out.println("\nSum of nodes in tree:");
        System.out.println(sumNodes(root));
        System.out.println("\nHeight of tree:");
        System.out.println(height(root));
        System.out.println("\nDiameter from 1st Approach of tree:");
        System.out.println(diameter(root));
        System.out.println("\nDiameter from 2nd Approach of tree:");
        System.out.println(diameter2(root).dm);
    }
}
