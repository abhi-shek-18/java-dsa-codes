public class Quick_Sort {
    public static int partition(int arr[],int l,int h) {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;   //for last element
       int temp=arr[i];
        arr[i]=pivot;
        arr[h]=temp;
        return i;
    }

        public static void quicksort ( int arr[], int l, int h){
            if (l < h) {
                int pivot_idx = partition(arr, l, h);
                quicksort(arr,l,pivot_idx-1);
                quicksort(arr,pivot_idx+1,h);
            }
        }
        public static void main (String args[]){
            int arr[] = {6, 3, 9, 5, 2, 8};
            int n = arr.length;
            quicksort(arr, 0, n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

