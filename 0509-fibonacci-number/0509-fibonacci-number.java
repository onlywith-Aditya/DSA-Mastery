class Solution {
    // HashMap<Integer, Integer> memo = new HashMap<>();

    public int fib(int n) {
    // 1. Recursion  
        // if(n == 0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        // return fib(n-1)+fib(n-2);

    // 2. DP
    //    if(n<=1) return n;

    //    // Check if already computed.
    //    if(memo.containsKey(n)){
    //     return memo.get(n);
    //    }

    //    // Compute and Store
    //    int result = fib(n-1) + fib(n-2);
    //    memo.put(n,result);
    //    return result;

    // 3. Tabulization with Space Optimization
    if(n == 0) return 0;
    if(n==1) return 1;
        int prev =1;
        int prev_prev = 0;
        int ans = 0;
        for(int i = 2 ; i <= n; i++){
            ans = prev + prev_prev;
            prev_prev = prev;
            prev = ans;
        }
        return ans;




}
}