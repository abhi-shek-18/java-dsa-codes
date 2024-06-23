public class Recursion_Invite {
    //number of ways in which we can invite n people to party ,either single or in pairs
    public static int invite(int n){
        if(n<=1){
            return 1;
        }
        int single=invite(n-1);
        int pair=(n-1)*invite(n-2);
        return single+pair;
    }
    public static void main(String args[]){
     int total_ways=invite(4);
        System.out.println(total_ways);
    }
}
