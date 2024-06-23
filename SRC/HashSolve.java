import java.util.*;
public class HashSolve {
    //first : Majority element:-find all the elements that appear more than [n/3] times
    public static void majorityElement(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){  //key exist
                map.put(nums[i],map.get(nums[i])+1);
            }else{   //key does not exist
                map.put(nums[i],1);
            }
        }

        for(int key: map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String args[]){
        int nums[]={1,3,2,5,1,3,1,5,1};
        int nums2[]={1,2};
        majorityElement(nums);
        majorityElement(nums2);
    }
}
