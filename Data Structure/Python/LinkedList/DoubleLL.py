class Node:
    def __init__(self, value=None):
        self.data = value
        self.next = None
        self.previous = None


class DoublyLL:
    def __init__(self):
        self.head = None
    

## Insertion in the end.
    def insertAtEnd(self, value):
        temp = Node(value)  
        if(self.head == None):
            self.head = temp
            return 
        else:
            t = self.head
            while (t.next != None):
                t = t.next
            t.next = temp
            temp.previous = t

## Insertion at the beginning
    def insertAtBeginning(self, value):
        temp = Node(value)
        if(self.head == None):
            self.head = temp
            return
        else:
            temp.next = self.head
            self.head.previous = temp
            self.head = temp

## Inserted at the middle.
### Searching Node.
    def insertAtMiddle(self, value, x): # x-> It is a value after which node has to attach.
        t = self.head
        while(t.next != None):
            if(t.data == x):
                break
            else:
                t = t.next
        
        ## Create a Node.
        temp  = Node(value)
        temp.next = t.next
        t.next.previous = temp
        t.next = temp
        temp.previous = t






## Print Doubly Linked List
    def printLL(self):
        t1 = self.head
        while(t1 != None):
            print(t1.data , end= " <--> ")
            t1 = t1.next
        print("NULL")

# ## Deletion for Node
#     def Deletion(self,value):
#         if(self.head == None):
#             print("LL Empty")
#             return

#         t = self.head
#         if(t.data == value): # First Node
#             self.head = t.next
#             self.head.previous = None
#             return

#         while(t.next != None): # At specific place.
#             if(t.data == value):
#                 t.previous.next = t.next
#                 t.next.previous = t.previous
#                 return
#             t=t.next
            
        
#             # Maybe at last.
#             if(t.data == value):
#                 t.previous.next = None
                    
## Deletion for Node
    def Deletion(self,value):
        if(self.head == None):
            print("LL Empty")
            return False

        t = self.head
        if(t.data == value): # First Node
            self.head = t.next
            if(self.head == None):
                self.head.previous = None
            return True

        while(t != None): # At specific place.
            if(t.data == value):
                if(t.previous != None):
                    t.previous.next = t.next
                if(t.next != None):
                    t.next.previous = t.previous
                return True
            t=t.next
            # Maybe at last.
            if(t.data == value):
                t.previous.next = None


## Making object and insert vales.
obj = DoublyLL()
obj.insertAtEnd(10)
obj.insertAtEnd(20)
obj.insertAtEnd(30)
obj.insertAtBeginning(90)
obj.insertAtMiddle(80,90)
obj.Deletion(30) 
obj.Deletion(20)
obj.Deletion(90)
obj.printLL()
