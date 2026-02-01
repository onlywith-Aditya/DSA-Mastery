# Count the number of digit.
class Solution:
    def countDigit(self, n):
        count = 0
        last_digit = 0
        print(n)
        #for i in range(n): 
            # Not used this loop because it run n time and we need n>0
        while(n>0):    
            last_digit = n%10  # Doesn't necessary
            count += 1
            # n = n/10   # This give floating number used //
            n = n//10
            
        print(count)
        return None
solution = Solution()
n = solution.countDigit(1234534365) # Output 5


#-------------------------|

# Log-> Count Number
# Count the number of digit. 

import math

class Solution:
    def countDigit(self, n):
        # Handle special case for 0
        if n == 0:
            return 1
        
        # Handle negative numbers
        num = abs(n)
        
        # Using log10 to count digits
        # Formula: floor(log10(n)) + 1
        count = math.floor(math.log10(num)) + 1
        
        print(count)
        return count

solution = Solution()
solution.countDigit(12345)  # Output: 5

