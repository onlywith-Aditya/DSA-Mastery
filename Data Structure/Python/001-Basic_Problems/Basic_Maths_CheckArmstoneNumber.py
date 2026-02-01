# Check Armstong Number or Not.
# Armstong Number = 371-> cube of each digit is equal to original number.
# Ex-> 371 abd 1634.
class Solution:
    def isArmstrong(self, n):   
        # Store original number
        original = n
        
        # Check Negative
        if n < 0:
            return False

        # First, count the number of digits
        temp = n
        digit_count = 0
        while temp > 0:
            digit_count += 1
            temp //= 10

        # Reset n and calculate sum of powers
        n = original
        sum_of_powers = 0
        
        while n > 0:
            digit = n % 10
            sum_of_powers += digit ** digit_count  # Use digit_count, not fixed 3
            n = n // 10
        
        return sum_of_powers == original

# Test the corrected solution
solution = Solution()

# Test cases
test_numbers = [153, 370, 371, 407, 1634, 8208, 9474, 123, 1234]

for num in test_numbers:
    result = solution.isArmstrong(num)
    print(f"{num} is Armstrong: {result}")
