# In this program we have to find first and last occurance in the array.

class Solution:
    def Find_Peak(self, arr, size):
        # Start 
        s = 0
        # End
        e = size - 1
        # Mid
        mid = s + (e-s)//2 # Using // otherwise it will give float value.
        while(s<e):
            if (arr[mid] < arr[mid + 1]):
                s = mid + 1
            else:
                e =  mid  
            mid = s + (e-s)//2 # Using // otherwise it will give float value.
        return mid
        




solution = Solution()
arr = [24,69,100,99,79,78,67,36,26,19]
size = len(arr)
print(f"Peak of Mountain is: {solution.Find_Peak(arr, size)}") 



