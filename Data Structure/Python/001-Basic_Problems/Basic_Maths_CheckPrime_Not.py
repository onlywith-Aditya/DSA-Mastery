# In this program we will check if function is prime or not.
class Solution:
    def isPrime(self, n):
        if n <= 1:
            return False
        
        count = 0
        i = 1
        
        while i * i <= n:
            if n % i == 0:
                count += 1
                if i != n // i:  # Avoid counting square root twice
                    count += 1
            i += 1  # ← CRITICAL: Increment i to avoid infinite loop
        
        # Prime numbers have exactly 2 divisors: 1 and itself
        return count == 2

solution = Solution()
print(solution.isPrime(36))  # False
print(solution.isPrime(17))  # True
print(solution.isPrime(1))   # False
    


solution = Solution()
n = solution.divisors(36)
print(n)