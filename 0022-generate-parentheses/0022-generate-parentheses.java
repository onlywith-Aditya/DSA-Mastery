class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        backtrack(result, "" , 0 , 0, n);
        return result;
    }

    private  void backtrack(List<String> result, String current, int open, int close, int n){

            // If we've used all brackets.
        if(open == n && close == n){
            result.add(current);
            return;
        }

            // Adding Open Bracket
        if(open < n){
            backtrack(result, current + "(", open +  1,  close, n);
        }

            // Adding Close Bracket
        if(close  < open){
            backtrack(result, current + ")",  open, close + 1, n);
        }




    }


}