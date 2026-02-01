class Node:
    def __init__(self,value):
        self.left = None
        self.right = None
        self.data = value
    

### Insertion of Node

def Insert(root, value):
    if(root == None):
        return Node(value)
    
    if(root.data == value):
        return root
    
    if(root.data > value):
        root.left = Insert(root.left,value)
    else:
        root.right = Insert(root.right,value)
    return root

## Searching Code

def Search(root, value):
    if(root == None):
        return print("X | Found")
    if(root.data == value):
        return print("Y | Found")
    if(root.data > value):
        Search(root.left,value)
    else:
        Search(root.right,value)

## In-Order, Print and Check of Binary Search Tree.

def InOrder(root):
    if(root!=None):
        InOrder(root.left)
        print(root.data, end=" ")
        InOrder(root.right)




#### Deletion of Node.
def Deletion(root, value):
    # Using Recursion to Find and Delete.
    if(root == None):
        return print("Not None, Root is: ", root)
    if(root.data > value):
        root.left = Deletion(root.left, value)
    elif(root.data < value):
        root.right = Deletion(root.right,value)
    
    ### Till here we found our Node to which we have to DELETE.

    else: # Delete for Case: 1 & Case: 2.
        if(root.left == None):
            return root.right
        if(root.right == None):
            return root.left
        else: # 2 Child-> Case: 3
            succ = get_Successor(root)
            root.data = succ.data
            root.right = Deletion(root.right, succ.data) # (Parent Address, Value Delete)
    return root

#### Get Successor
def get_Successor(root):
    root = root.right
    while(root != None and root.left != None) :
        root = root.left
    return root


#### Perform Opreation
root = Insert(None,20)
root = Insert(root,15)
root = Insert(root,30)
root = Insert(root,40)
root = Insert(root,12)
root = Insert(root,18)
root = Insert(root,25)
root = Insert(root,50)

InOrder(root)
# print("\nSearching: \n")
# Search(root,20)
# Search(root,14)
# Search(root,15)
# Search(root,50)

print("\nDeletion: \n")
# Case-> 1 [No Child] 
Deletion(root, 20)
# Case-> 2 [Uno Child] 
Deletion(root, 40)
# Case-> 3 [Dos Child] 
Deletion(root, 12)


InOrder(root)