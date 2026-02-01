# We are implementing Binary Search on an array.
# Array is not used in python so we will used numpy for it.

class Solution:
    def binarySearch(self,arr,key,size):
        print(f"Array is: {arr}")
        print(f"Key is: {key}")

        # Logic is here.
            # We need intial and last point of an array.
        start = 0
        end = size-1
        mid = start + (end - start)//2
        while start<=end:
            if key == arr[mid]:
                return mid
            elif key > arr[mid]: 
                start = mid + 1 
                
            elif key < arr[mid]: 
                end = mid - 1
            else: 
                return "Not Found!!!" 
            
            mid = start + (end-start)//2
        return -1



            

        # In this we simply using linear search.
    # def linearSearch(self, arr):
    #     for i in range(len(arr)):
    #         print(arr[i])
    #     return -1
    



solution = Solution()
arr = [1,2,3,4,5]
size = len(arr)
key = 5
n = solution.binarySearch(arr,key,size)
print(f"Present at index: {n}")



