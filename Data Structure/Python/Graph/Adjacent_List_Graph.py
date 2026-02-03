class Graph:
    def __init__(self):
        self.adjList = {}

    # Add Vertex-> Source
    def add_vertex(self,vertex):
        if vertex not in self.adjList:
            self.adjList[vertex] = []
            # key = value

    def addEdge(self, src, dest):
        self.add_vertex(src)
        self.add_vertex(dest)


        # Undirected Graph
        self.adjList[src].append(dest)   
        self.adjList[dest].append(src)

    def Display(self):
        for vertex in self.adjList:
            print(vertex, "->", self.adjList[vertex], end='\n')

## Test Code
g = Graph()
g.addEdge(1,2)
g.addEdge(2,3)
g.addEdge(1,4)
g.addEdge(4,3)
g.addEdge(2,4)
g.addEdge(4,5)
g.addEdge(3,5)

g.Display()