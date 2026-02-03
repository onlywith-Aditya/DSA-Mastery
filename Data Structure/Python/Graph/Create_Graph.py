# Comments-> 

## Use two square bracket because we need list inside list, like matrix.
        # "0"--> Initialize with 0
        # Multiply with vertex, and use loop to do it no. of vertex time.

## src > 0 and < vertex
        # if(0<=src <self.size and 0<= dest < self.size ):

## Undirected Graph->
    ### mat[src][dest] = 1
    ### mat[dest][src] = 1
## Dirtected Graph-> 
    ### mat[src][dest] = 1
## Weighted Graph->
    ### Add one more parameter "weight"
        ### mat[src][dest] = weight


class Graph:
    def __init__(self, vertex):
        self.mat = [[0] * vertex for x in range(vertex)] 
        
        self.size = vertex

    # Method to add edge 
    def add_edge(self, src, dest): 

        if(self.size > src >= 0 and self.size > dest >= 0):
            # Un-Directional graph
            self.mat[src][dest] = 1
            self.mat[dest][src] = 1
        
        else:
            print("Invalid Edge")


    # Print Matrix
    def Display(self):
        for row in self.mat:
            # Use map to convert list into string.
            print(' '.join(map(str,row)))


# Test
G =  Graph(5)
G.add_edge(0,1)
G.add_edge(1,3)
G.add_edge(3,4)
G.add_edge(4,2)
G.add_edge(2,0)
G.add_edge(2,3)

G.Display()