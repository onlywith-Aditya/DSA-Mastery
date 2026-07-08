class Solution {
    private static final int MOD = 1_000_000_007;
    
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        long[] preSum = new long[n+1];
        long[] preCat = new long[n+1];
        int[] preNonZeroCnt = new int[n+1];
        long[] pow10 = new long[n+1];
        pow10[0] = 1;
        
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            preSum[i+1] = preSum[i] + digit;
            pow10[i+1] = (pow10[i] * 10) % MOD;
            if (digit != 0) {
                preCat[i+1] = (preCat[i] * 10 + digit) % MOD;
                preNonZeroCnt[i+1] = preNonZeroCnt[i] + 1;
            } else {
                preCat[i+1] = preCat[i];
                preNonZeroCnt[i+1] = preNonZeroCnt[i];
            }
        }
        
        int[] ans = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int l = queries[q][0];
            int r = queries[q][1];
            
            long sum = preSum[r+1] - preSum[l];
            int cnt = preNonZeroCnt[r+1] - preNonZeroCnt[l];
            
            long x = (preCat[r+1] - preCat[l] * pow10[cnt] % MOD + MOD) % MOD;
            ans[q] = (int) ((x * sum) % MOD);
        }
        return ans;
    }
}