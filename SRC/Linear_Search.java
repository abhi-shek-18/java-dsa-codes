import java.util.*;
public class Linear_Search {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=s.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(num[i]+" ");
        }

        int x=s.nextInt();
        for(int i=0;i<size;i++){
            if(x==num[i]){
                System.out.println("Number "+x+" found at "+i+" index");
            }
            else{
                System.out.println("Number not present in the array");
                break;
            }
        }
    }
}
