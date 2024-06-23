//import java.util.HashMap;
import java.util.*;
public class Hashmaps {
    public static void main(String args[]){
//It works in key value pairs
        //key->country   & value->population
        HashMap<String, Integer>map=new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        //Search
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }
        if(map.containsValue(150)){
            System.out.println("Correct value "+map.get("China"));
            //map.get("China") will give whether key exists
        }else{
            System.out.println("Wrong Value");
        }
        int arr[]={1,2,3,4,5};
        //for(datatype var: Collection)
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        //Iteration in Hashmap
        //Map.Entry<key_datatype,value_datatype> e:Map.entrySet()
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.print(e.getKey()+" :");
            System.out.println(e.getValue());
        }
        map.remove("China");
        System.out.println(map);
    }
}
