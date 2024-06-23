import java.util.*;
public class Recursion3_fib {
    public static void fib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fib(b,c,n-1);

    }
    public static void main(String args[]){
        int a=0,b=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(a);
        System.out.println(b);
        fib(a,b,n-2);
    }
}
