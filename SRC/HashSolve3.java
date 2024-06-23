//finding iternary from the tickets
import java.util.*;
public class HashSolve3 {
    //function to check the start point
    public static String getStart(HashMap<String,String>tick){
        HashMap<String,String>revMap=new HashMap<>();
        //creating reverse map by converting value to key and key to value
        for(String key:tick.keySet()){
            //key->key ; val->tick.get(key)
            revMap.put(tick.get(key),key);
        }
        //comparing tick keys with revMap keys
        for(String key:tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String>tickets=new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start=getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start+"->");
            start=tickets.get(start);  //assigning new start value as the destination value of the first start

        }
        System.out.println(start);
    }
}
