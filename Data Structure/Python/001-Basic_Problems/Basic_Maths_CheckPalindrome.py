# Check Number is Palindrome or not.
# Number which look same when reverse them.


# It is simple just reverse a number and check with condition is it reverse of not if yes then true else false.

class Solution:
    def isPalindrome(self, n):
        originalNum = n
        checkPal = 0
        mod =0
        
        # Check Negative
        if n<0:
            print("Enter Number Greater than 0")
            return False
        
        while(n>0):
            mod = n%10
            checkPal = (checkPal * 10)+mod
            n = n//10
        if checkPal == originalNum:
            return True
        else:    
            return False
solution = Solution()
n = solution.isPalindrome(14541)
print(n)
