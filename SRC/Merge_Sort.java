import java.util.*;
public class Merge_Sort {
    //time comp=nlogn
    public static void conquer(int arr[],int s,int mid,int e){
        int merger[]=new int[e-s+1];
        int idx1=s;  //for tracking the first array
        int idx2=mid+1;  //for tracking the second array
        int x=0;  //for tracking the merger array
        while(idx1<=mid && idx2<=e){
            if(arr[idx1]<=arr[idx2]){
                merger[x++]=arr[idx1++];
            }
            else{
                merger[x++]=arr[idx2++];
            }
        }

        //for the remaining elements
        while(idx1<=mid){
            merger[x++]=arr[idx1++];
        }
        while(idx2<=e){
            merger[x++]=arr[idx2++];
        }

        //now copy the merger elements into the original array
        for(int i=0, j=s;i<merger.length;i++, j++){
            arr[j]=merger[i];
        }
    }
    public static void divide(int arr[],int s,int e){
       if(s>=e){
           return;
       }
        int mid=s+(e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);
    }

    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
