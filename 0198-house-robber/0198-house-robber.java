class Solution {
    int[] memo;

    public int rob(int[] nums) {
        
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return robHelper(nums, 0);

    }

    private int robHelper(int[] nums, int index){
        // Base case: No House
        if(index >= nums.length) return 0;
        
        // Check computed or not.
        if(memo[index]!= -1) return memo[index];

        // Compute and Store
        int robCurrent = nums[index] + robHelper(nums, index+2);
        int skipCurrent = robHelper(nums, index+1);

        memo[index] = Math.max(robCurrent, skipCurrent);
        return memo[index];


    }


}
