class Node:
    def __init__(self,value):
        self.left = None
        self.right = None
        self.data = value

## Testing Code.
def preOrder(root):
    if(root != None):
        print (root.data, end = " ")
        preOrder(root.left)
        preOrder(root.right)
        

def InOrder(root):
    if(root != None):
        InOrder(root.left)
        print (root.data, end = " ")
        InOrder(root.right)


def PostOrder(root):
    if(root != None):
        PostOrder(root.left)
        PostOrder(root.right)
        print (root.data, end = " ")
        

# Creating a tree, to test code.
root = Node(1)
root.left = Node(3)
root.right = Node(5)
root.left.left = Node(2)
root.left.right = Node(4)
root.right.right = Node(8)

print("\nPreOrder Traversal:")
preOrder(root) ## Preorder Traversal.
print("\nInOrder Traversal:")
InOrder(root) ## Inorder Traversal.
print("\nPostOrder Traversal:")
PostOrder(root) ## Postorder Traversal.
