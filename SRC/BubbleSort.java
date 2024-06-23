import java.util.*;
public class BubbleSort {
    // Compare and place the largest number at the end
    //after each iteration no need to compare with already sorted element
    // at the last
    //No of Comparison=n-1
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
    }
    public static void main(String args[]){
         int arr[]= {7,8,3,1,2};
         for(int i=0;i<arr.length-1;i++){
             for(int j=0;j<arr.length-i-1;j++){  //to ignore the sorted elements
                 if(arr[j]>arr[j+1]){
                     //swap
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }
         printArray(arr);
    }
}
