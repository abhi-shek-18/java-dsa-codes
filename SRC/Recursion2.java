import java.util.*;
public class Recursion2 {
    //Factorial by recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = n * factorial(n - 1);
        return ans;
    }


    public static void main(String args[]){
     int ans=factorial(5);
        System.out.println(ans);
    }
}
