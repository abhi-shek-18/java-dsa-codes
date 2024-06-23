import java.util.*;
public class Recursion4 {
          //to print the x to the power of n where stack height is n
    //base case 1. x==0 then ans=0
    //base case 2. n==0 then ans=1
    public static int printPow(int x,int n){
        if(x==0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        int ans=x*printPow(x,n-1);
        return ans;
    }
//print the x to the power for stack height of log n

    public static int printPower(int x,int n){
        if(x==0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        //if n is even
        if (n%2==0){
            return printPower(x,n/2)*printPower(x,n/2);
        }
        //n is odd
        else{
            return printPower(x,n/2)*printPower(x,n/2)*x;
        }
    }


    //calculate the power of x where stack height is log n.
    public static void main(String args[]){
        int ans=printPow(2,8);
        System.out.println(ans);
        int res=printPower(2,8);
        System.out.println(res);
    }
}
