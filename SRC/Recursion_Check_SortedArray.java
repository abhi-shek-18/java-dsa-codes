import java.util.*;
public class Recursion_Check_SortedArray {
    //array should be strictly increasing
    public static boolean checkSort(int arr[],int idx){
        int len=arr.length;
        if(idx==len-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return checkSort(arr,idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
int arr[]={1,3,2};
        System.out.println(checkSort(arr,0));
    }
}
