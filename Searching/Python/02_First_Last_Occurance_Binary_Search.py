# In this program we have to find first and last occurance in the array.

class Solution:
    def firstOcc(self,arr,key,size):
        self.s = 0
        self.e = size-1
        first = -1  # Store first occurance. 
        while self.s<=self.e:
            mid = self.s + ((self.e - self.s) // 2)

            if key == arr[mid]:
                first = mid     # Store potential first occurance.
                self.e = mid - 1            # Search left part.
            elif key > arr[mid]: 
                self.s = mid + 1 
            else: 
                self.e = mid - 1
        
        return first
    
    def lastOcc(self,arr,key,size):
        self.s = 0
        self.e = size - 1
        last = -1

        while self.s<=self.e:
            mid = self.s + ((self.e - self.s) // 2)

            if key == arr[mid]:
                last = mid     # Store potential last occurance.
                self.s = mid + 1            # Search right part.
            elif key > arr[mid]: 
                self.s = mid + 1 
            else:               # Left Side
                self.e = mid - 1
        
        return last

    def totalOcc(self,arr,key,size):
        """Calculate total occurrences using first and last occurrence"""
        first = self.firstOcc(arr, key, size)

        if first == -1:
            return 0                ## Key Not Found
        
        last = self.lastOcc(arr,key,size)
        return (last - first) +1




solution = Solution()
arr = [1, 3, 3, 3, 3, 5, 5, 7]
size = len(arr)
key = 3
first = solution.firstOcc(arr,key,size)
last = solution.lastOcc(arr,key,size)
total = solution.totalOcc(arr,key,size)
print(f"Array: {arr}")
print(f"Key: {key}")
print(f"First occurrence at index: {first}")
print(f"Last occurrence at index: {last}")
print(f"Total occurrences: {total}")



