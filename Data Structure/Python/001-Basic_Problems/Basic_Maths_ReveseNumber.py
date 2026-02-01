# Reverse the number without inbilit function.
class Solution:
    def reverseNumber(self, n):

        # Handle negative numbers
        is_negative = False
        if n < 0:
            is_negative = True
            n = abs(n)



        reNum = 0
        mod = 0
        while(n>0):
            mod = n%10 
            reNum = (reNum *10)+ mod
# Always used // for interger in division.
            n = n//10

# Restore Negative Sign 
# Restore negative sign if original number was negative
        if is_negative:
            reNum = -reNum
        print(reNum)
        return None
solution = Solution()
n = solution.reverseNumber(-12345)