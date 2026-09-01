import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Step 1: Convert list to set for O(1) lookup
        Set<String> wordSet = new HashSet<>(wordList);
        
        // Edge case: endWord not in wordList
        if (!wordSet.contains(endWord)) {
            return 0;
        }
        
        // Step 2: BFS
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                
                // Try changing each character
                char[] wordArray = currentWord.toCharArray();
                for (int j = 0; j < wordArray.length; j++) {
                    char originalChar = wordArray[j];
                    
                    // Try all letters from 'a' to 'z'
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue;
                        
                        wordArray[j] = c;
                        String newWord = new String(wordArray);
                        
                        // Found endWord
                        if (newWord.equals(endWord)) {
                            return level + 1;
                        }
                        
                        // If newWord is in wordSet, add to queue
                        if (wordSet.contains(newWord)) {
                            queue.offer(newWord);
                            wordSet.remove(newWord);  // Mark as visited
                        }
                    }
                    
                    // Restore original character
                    wordArray[j] = originalChar;
                }
            }
            
            level++;
        }
        
        return 0;
    }
}