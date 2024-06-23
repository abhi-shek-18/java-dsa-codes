import java.util.*;
public class Recursion_Subsets {
    public static void printSubset(ArrayList<Integer>subset){
        for(int i=0;i< subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        //add element
        subset.add(n);
        findSubset(n-1,subset);

        //remove element if any
        subset.remove(subset.size()-1);
        findSubset(n-1,subset);
    }
    public static void main(String args[]){
        int n=3;
        ArrayList<Integer>subset=new ArrayList<>();
        findSubset(n,subset);
    }
}
