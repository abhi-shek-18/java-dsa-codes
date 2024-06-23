import java.util.*;
public class BitManipulation {
    public static void main(String args[]){
        //Get bit->Perfrom AND
        //get the 3rd bit (pos=2) of a number n=0101
        //Operation:1->Bit mask= 1<<i  2->Perfrom AND
        //if resultant is not zero then the bit is 1 else 0
        int n=5;
        int pos=2;
        int bitMask= 1<<pos;

        if((bitMask & n)==0){
            System.out.println("Bit is: 0");
        }
        else{
            System.out.println("Bit is: 1");
        }

        //Set Bit->perform OR
        //set the 2nd bit(pos=1) of number n=0101
        //look bit index from right side
        //Bit mask: 1<<pos
        //Operation: perfrom OR
        int newPos=1;
        int bitMask2=1<<newPos;
         int newNum=bitMask2|n;
        System.out.println(newNum);

        //Clear bit->Perfrom AND with BitMask NOT
        //clear the 3rd bit (pos=2) of a number n=0101
        //Operation:1->Bit mask= 1<<i  2->Perfrom AND with NOT
        int notBitmask=~(bitMask);
        int ans=n & notBitmask;
        System.out.println(ans);

        //Update Bit
        //Operation: 1->FOR 0  ->AND with NOT (CLEAR Operation)
        //Operation: 2->FOR 1  ->OR    (SET Operation)
        //Update the 2nd bit(pos=1) of a number n=0101(5) to 1
        newNum=bitMask2|n;
        System.out.println(newNum);
    }
}
