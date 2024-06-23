import java.util.*;
public class insertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Insertion Sort:In this we consider one part as sorted and another as unsorted
    //then comparing it with other elements at left side and inserting the element in the sorted one.
    public static void main(String args[]) {
        int arr[] = {7, 8, 3, 1, 2};
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
arr[j+1]=arr[j];  //shifting the bigger element at the right side
j--;
            }
            //when while loop condition terminates the place the smallest element at the first
            arr[j+1]=curr;
        }
        printArray(arr);
    }
}
