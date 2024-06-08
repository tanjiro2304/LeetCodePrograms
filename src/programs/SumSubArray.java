package programs;

public class SumSubArray {
    public static boolean checkSubarraySum(int[] nums, int k){
        if(nums.length > 2) {
            int sum = 0;
            int size = nums.length;
            for (int i : nums) {
                sum = sum + i;
            }

            if ((sum % k) == 0) {
                int result = sum % k;
                return result == 0;
            }

            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {23,2,4,6,6};

        System.out.println("Result is " +checkSubarraySum(nums, 7));
    }
}