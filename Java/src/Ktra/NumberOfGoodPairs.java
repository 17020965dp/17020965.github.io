package Ktra;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] nums){
        Map<Integer , Integer> data = new HashMap<>();
        for(int num : nums) {
            if(data.containsKey(num)){
                int tmp = data.get(num) +1;
                data.put(num,tmp);
            }
            else {
                data.put(num,1);
            }
        }
        int count = 0;
        for(int value : data.values()){
            count += value * (value-1)/2;
        }
        return count;
    }
}
