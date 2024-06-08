package programs;

import java.util.ArrayList;
import java.util.List;

public class SumSubArray {
    public static boolean checkSubarraySum(int[] nums, int k){

        for(int i = 0; i<= nums.length - 1; i++){
            List<Integer> subarray = new ArrayList<>();
            int sum = nums[i];
            subarray.add(nums[i]);
            for(int j = i + 1; j< nums.length; j++){
                subarray.add(nums[j]);
                sum = sum + nums[j];

                    if ((sum % k) == 0) {
                        int result = sum % k;
                        return result == 0;
                    }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {23,2,6,4,7};

        System.out.println("Result is " +checkSubarraySum(nums, 13));
    }

    public static boolean checkSubArray(int[] nums, int k){
        if(nums.length > 2) {
            int sum = 0;
            List<Integer> subArray = new ArrayList<>();
            for (int i : nums) {
                sum = sum + i;
                subArray.add(i);
                if(subArray.size() > 2){
                    if ((sum % k) == 0) {
                        int result = sum % k;
                        return result == 0;
                    }
                }
            }
            return false;
        }
        return false;
    }
}