public class Recursion_permutation {

    public static void printPermutation(String str,String permutation){
       if(str.length()==0){
           System.out.println(permutation);
           return;
       }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i); //a
            String newStr=str.substring(0,i)+str.substring(i+1);  //bc
            printPermutation(newStr,permutation+curr);
        }
    }
    public static void main(String args[]){
         String str="abc";
         printPermutation(str,"");
    }
}
