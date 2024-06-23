import java.util.*;
public class Recursion_totalPaths {
    //count the total paths in a maze to move from (0,0) to (n,m).
    public static int countPaths(int i,int j,int n,int m){
//for boundary case
        if(i==n || j==m){
            return 0; //no paths
        }
        if(i==n-1 && j==m-1){
            return 1;  //only one path
        }
        //move downwards
        int downPaths=countPaths(i+1,j,n,m);

        //move right
        int rightPaths=countPaths(i,j+1,n,m);

        return downPaths+rightPaths;
    }
    public static void main(String args[]){
        int n=3,m=3;
        int total=countPaths(0,0,n,m);
        System.out.println(total);
    }
}
