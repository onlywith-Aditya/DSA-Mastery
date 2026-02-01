# Using Recrusion to iterate string.

class Solution:
    def Name_count(self, name, count):
        if count <= 0:
            print("Done!")  
            return  
        
        print(f"{count}.{name}")
        self.Name_count(name, count -1)

solution =  Solution()
n = solution.Name_count("Aditya", 3)