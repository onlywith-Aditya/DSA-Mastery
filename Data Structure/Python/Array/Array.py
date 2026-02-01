# Use Numpy for array.
## Dynamic memory allocation.


#import array as ar
from array import *

# We use typecode for array size. 
# i(int->2),l(int->2),u(Unicode Character->2),g(int->2),H(int->2),l(int->4),(int->4),f(Float->4),d(Float->8)
val = array('i',[1,2,3,4,5,6])
print(val)

### For Iteration

#1st-Way
for i in range(0,6): # 0-> Included and # 6-> Excluded.
    print(val[i])

#2nd-Way
for x in val:
    print(x, end=",")

### Find length of array.
# len(val)

### Typecode
# val.typecode

### Reverse
# val.reverse()

### Insert
#  val.insert('index' , "Value")

### Last Insert
# val.append("Value")

### Overwrite
# var[2] = 100


### Copy-Array
copyarray = array(val.typecode, (x for x in val))
print("\nCopy Array:")
for i in copyarray:
    print(i, end=",")


### Delete Element from Array
copyarray.pop(3)
print("\nDelete: ",copyarray)

### Remove Element-> If know element.
copyarray.remove(5)
print("Remove: ",copyarray)

### Slicing to get likewise element.
#val[start index : end index]

### Take element from user.
# arr.append(int(input("Enter a number: ")))

### Searching 
# i = arr.index("Element Value")-> Print"i"

### Multi-dimensional Array
## Using Numpy

