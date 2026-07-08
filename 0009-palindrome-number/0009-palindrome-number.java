class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        
        // Count digits
        int temp = x;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        return isPalindromeHelper(x, digits);
    }
    
    private boolean isPalindromeHelper(int x, int digits) {
        if (digits <= 1) return true;
        
        int div = (int) Math.pow(10, digits - 1);
        int first = x / div;
        int last = x % 10;
        
        if (first != last) return false;
        
        int remaining = (x % div) / 10;
        return isPalindromeHelper(remaining, digits - 2);
    }
}