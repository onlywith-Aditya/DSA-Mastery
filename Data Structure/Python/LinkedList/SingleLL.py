class Node: # Using class to create user-define datatype.
    # Memory Allocation-> We used constructor, in python __init__
    def __init__(self,info, next=None):
        self.data = info
        self.next = next
    
class SinglyLinkedList:
    def __init__(self,head=None):
        self.head = head

# Insertion in the end.
    def insertAtEnd(self, value):
        temp = Node(value)
        if(self.head != None):
            t1 = self.head
        #  Moving t1 till Null
            while(t1.next != None):
                t1 = t1.next
            t1.next = temp
        else:
            self.head = temp

# Insertion in the beginning.
    def insertAtBeginning(self, value):
        temp = Node(value)
        temp.next = self.head
        self.head = temp


# Insertion in the middle.
    def insertAtMiddle(self,value,x):
        # So, first we have to do traversing to find that element and after that we have to insert that node and data.
        temp = Node(value)
        t1= self.head
        if(t1.data == value):
            self.head = t1.next
        while(t1.next != None):
            if(t1.data == x):
                temp.next = t1.next
                t1.next = temp
            t1 = t1.next


# Delete a node by value
    def deleteLL(self, value):
        """Delete the first occurrence of node with given value"""
        if self.head is None:
            print("List is empty")
            return
        
        # Case 1: Delete head node
        if self.head.data == value:
            self.head = self.head.next
            return
        
        # Case 2: Delete middle or last node
        t1 = self.head
        prev = None
        
        while t1 is not None:
            if t1.data == value:
                prev.next = t1.next
                return
            prev = t1
            t1 = t1.next
        
        print(f"Node with value {value} not found")



# Print
    def printLL(self):
        t1 = self.head
        while(t1.next!= None):
            print(t1.data)
            t1 = t1.next
        print(t1.data)

obj = SinglyLinkedList()
obj.insertAtEnd(10)
obj.insertAtEnd(20)
obj.insertAtEnd(30)
obj.insertAtBeginning(5)
obj.insertAtMiddle(40,20)
obj.deleteLL(5)

obj.printLL()
