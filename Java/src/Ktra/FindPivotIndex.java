package Ktra;

public class FindPivotIndex {
    public static void main(String[] args){
        int [] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
    static int pivotIndex(int[] nums){

        int left = 0, right =0;

        for(int i=0;i<nums.length;i++){
            left += nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(right == left - right - nums[i]){
                return i;
            }
            right += nums[i];
        }
        return -1;
    }
}
