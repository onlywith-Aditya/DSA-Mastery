class Solution {
    HashMap<Integer, Integer> memo = new HashMap<>();

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
       if(n<=1) return n;

       // Check if already computed.
       if(memo.containsKey(n)){
        return memo.get(n);
       }

       // Compute and Store
       int result = fib(n-1) + fib(n-2);
       memo.put(n,result);
       return result;
}
}