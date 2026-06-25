class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int balance = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    balance++;
                } else {
                    balance--;
                }

                // If balance > 0, target is the majority element in nums[i..j]
                if (balance > 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}