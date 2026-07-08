class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Edge case: empty input
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // HashMap mapping digits to letters
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        backtrack(result, map, digits, "", 0);
        return result;
    }
    
    private void backtrack(List<String> result, Map<Character, String> map, 
                           String digits, String current, int index) {
        // Base case: we've processed all digits
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        // Get the digit and its corresponding letters from HashMap
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        
        // Normal for loop - iterate through each character
        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            backtrack(result, map, digits, current + c, index + 1);
        }
    }
}