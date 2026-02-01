# We have to find total number of occurance.
# Either used linear search in which time complexity is O(n).
# But if you want result in O(log n) used bianry search.
class Solution:
    def binarySearch(self,arr,key,size):
        self.s = 0
        self.e = size-1
        mid = self.s + ((self.e-self.s)//2)

        while self.s<=self.e:
            if key == arr[mid]:
                # Store where we found the key.
                self.found_index = mid
                return mid
            elif key > arr[mid]: #  Right Side
                self.s = mid + 1
            elif key < arr[mid]:  # Left Side
                self.e = mid - 1
            else: 
                return "Not Found!!"
            
            mid = self.s + ((self.e-self.s)//2)
        self.found_index = -1
        return -1
            



    def occurance(self,arr,size):
        if self.found_index == -1:
            return 0
        count  = 0
        for num in arr:
            if num == key:
                count += 1
        return count

solution = Solution()
arr = [1,3,2,3,3]
size = len(arr)
key = 3
n = solution.binarySearch(arr,key,size)
occ = solution.occurance(arr,size)
print(f"Present at index: {n}")
print(f"Number of Occurance: {occ}")



