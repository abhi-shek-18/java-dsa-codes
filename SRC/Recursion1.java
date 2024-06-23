import java.util.*;
public class Recursion1 {
    //Print numbers from 5 to 1
    public static void printSum(int i,int n,int sum) {
       if(i==n){
           sum+=i;
           System.out.println(sum);
           return;
       }
       sum+=i;
       printSum(i+1,n,sum);
    }
    public static void main(String args[]){
        printSum(1,5,0);
    }
}
