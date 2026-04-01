class Solution {
    public int MaximumSubarray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) currentSum = 0;




        }
        return maxSum;

    }
}