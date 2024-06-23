import java.util.*;
public class HashSolve2 {
    //finding the union of the two arrays.  O(n)
    public static int union(int arr1[],int arr2[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println(set);
        return set.size();
    }

    //Intersection
    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr1[i]);
            }
        }
        return count;

    }
    public static void main(String args[]){
        int num1[]={7,3,9};
        int num2[]={6,3,9,2,9,4};
        System.out.println(union(num1,num2));
        System.out.println(intersection(num1,num2));
    }
}
