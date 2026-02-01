# In this fucntionw we have to print all divisor of following number.

class Solution:
    def divisors(self, n):
        for i in range(1,n):
            if n%i==0:
                print(i)
            else:
                None
        return None

solution = Solution()
n = solution.divisors(36)