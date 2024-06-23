import java.util.*;
public class Recursion_TOH {
//rules in Tower of Hanoi
    //1.only one disk is transferred in 1 step
    //2.Smaller disks are always kept on top of larger disks
    //first shift n-1 disk to helper tower and transfer larger disk to the destination
    //then update source tower as helper and helper tower as the source tower.
//time Complexity=2^n
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String args[]){
int n=2;
towerOfHanoi(n,"S","H","D");
    }
}
