import java.util.*;
public class Recursion_Tiles_Problem {
    //Place tiles of size 1*m in  a floor of size n*m
    public static int PlaceTiles(int n,int m){
       if(n==m){
           return 2;  //two ways to place the tiles on the floor
       }
       if(n<m){
           return 1; //only one way to place the tile on the floor
       }
        //vertically placed
        int vert=PlaceTiles(n-m,m);
        // horizontally placed
        int horizon=PlaceTiles(n-1,m);

        return vert+horizon;
    }
    public static void main(String args[]){
        int n=4,m=2;
        int total_Ways=PlaceTiles(n,m);
        System.out.println(total_Ways);
    }
}
