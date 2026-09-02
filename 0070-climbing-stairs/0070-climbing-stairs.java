class Solution {
    HashMap<Integer,Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        
    // 1. Recursion
    // if(n==1) return 1;
    // if(n==2) return 2;
    // return climbStairs(n-1)+climbStairs(n-2);

    // 2. DP
    if(n==1) return 1;
    if(n==2) return 2;
    
        // Check if already computed.
    if(memo.containsKey(n)){
        return memo.get(n);
    }
        
        // Computer and store
    int result = climbStairs(n-1) + climbStairs(n-2);
    memo.put(n,result);

return result;

    }
}