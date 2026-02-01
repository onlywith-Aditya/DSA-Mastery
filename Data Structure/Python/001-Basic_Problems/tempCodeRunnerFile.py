# Check Armstong Number or Not.
# Armstong Number = 371-> cube of each digit is equal to original number.
# Ex-> 371 abd 1634.
class Solution:
    def isArmstrong(self, n):   
        varSum = 0
        varCube = 0
        varMod = 0
        varOriginal = n

        # Check Negative
        if n < 0:
            return False

        while(n > 0):
            varMod = n % 10
            varCube = varMod**3
            varSum += varCube
            n = n//10
        
        if varSum == varOriginal:
            return True
        else: 
            return False
        


solution = Solution()
n = solution.isArmstrong(1632)
print(n)
        