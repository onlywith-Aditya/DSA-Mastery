# Insertion in BST.
class Node:
    def __init__(self, value):
        self.left = None
        self.right = None
        self.data = value


## Insertion Code
def insert(root,value):
        if(root == None): # Insert first element as root node.
            return Node(value)
        if(root.data == value):
            return root # Last Line of Tree Insertion.
        if(root.data > value):
            root.left = insert(root.left, value)
        else:
            root.right = insert(root.right, value)
        return root
    
## Searching Code
def search(root,value):
        if(root == None): 
            print(" X | Node Not Found ")
            return
        if(root.data == value):
            print(" Y | Node Found ")
            return
        if(root.data > value):
            search(root.left, value)
        else:
            search(root.right, value)
        # return print("!!!!->No Node<-!!!!")


## Inorder Code
def  InOrder(root):
        if(root !=None):
            InOrder(root.left)
            print(root.data, end= " ")
            InOrder(root.right) 

## Way-> 1st

#root = Node(20)
# root.left = Node(15)
# root.right = Node(30)
# root.left.left = Node(12)
# root.left.right = Node(18)
#InOrder(root)


## Way-> 2nd
root = insert(None,20)
root = insert(root,15)
root = insert(root,12)
root = insert(root,15)
root = insert(root,30) 
root = insert(root,25)
root = insert(root,50)
InOrder(root)
        ### Searching
print("\nSearching: \n")
search(root, 20)
search(root, 15)
search(root, 50)
search(root, 6969)