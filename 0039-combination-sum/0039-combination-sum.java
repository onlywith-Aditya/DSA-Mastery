class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        // 1. We pick candidate again and again.
        // 2. If candidate > remaining target, skip it.
        // 3. When remaining == 0, we found a combination.

        List<List<Integer>>  result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
        
    }

    private void backtrack(List<List<Integer>> result,  List<Integer> current, int[] candidates, int rem, int start){

        // Base case-> we found a valid combination.
        if(rem ==  0){
            result.add(new ArrayList<>(current));
            return;
        }

        // Try each candidate starting from 'start' index.
        for(int i = start; i < candidates.length; i++){

            if(candidates[i] > rem){
                continue;
            }

            current.add(candidates[i]);

            backtrack(result, current, candidates, rem - candidates[i], i);

            // Backtrack: remove the last added candidate.
            current.remove(current.size() - 1);


        }


    }

}