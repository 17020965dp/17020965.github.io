package FinalExam2;

import java.util.ArrayList;
import java.util.List;

public class b442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index] <0){
                l.add(index+1);

            }
        }
        return l;


        // Đang sai :(
    }
}
