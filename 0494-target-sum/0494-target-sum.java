class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        // 1. Recursion
        // 2. Memo. ->DP
        // 3. Tabu. -> DP
        // 4. Space Optimized-> [1D-DP]

        int totalSum = 0;
        for(int num : nums) totalSum += num;

        // If target is out of range or (target + totalSum) is odd

        if(Math.abs(target) > totalSum || (target + totalSum) % 2 != 0){
            return 0;
        }

        int subsetSum = (target + totalSum) / 2;
        int[] dp= new int[subsetSum + 1];
        dp[0] = 1; // One way to make sum 0: empty subset

        for( int num : nums){
            for( int j = subsetSum; j >= num; j--){
                dp[j] += dp[j-num];
            }
        }
return dp[subsetSum];


    }
}