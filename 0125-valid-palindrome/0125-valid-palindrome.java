class Solution {
    public boolean isPalindrome(String s) {
        
        // Clean string: remove non-alphanumeric, convert to lowercase.
        
        String  clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return isPalindromeHelper(clean, 0 , clean.length()-1);


    }
    private boolean isPalindromeHelper(String s, int left, int right){

        if(left>=right){
            return true;
        }

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }

        return isPalindromeHelper(s, left +1, right -1);
    }
}