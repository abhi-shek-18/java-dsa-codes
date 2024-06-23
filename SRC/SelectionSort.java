import java.util.*;
public class SelectionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
        //Selection Sort:It takes first element and compare with
        //other elements in the array. If any small element then update
        //selected element and then after full checking swap it with the
        //initial element.
        public static void main(String args[]){
            int arr[]={7,8,3,1,2};

            for(int i=0;i<arr.length-1;i++){
                int initial=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[initial]){
                       initial=j;
                    }
                }
                int temp=arr[initial];
                arr[initial]=arr[i];
                arr[i]=temp;
            }
            printArray(arr);
        }

}

