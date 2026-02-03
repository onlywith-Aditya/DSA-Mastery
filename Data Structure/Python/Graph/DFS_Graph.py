class Graph:
    def __init__(self,vertex):
        self.mat = [[0] * vertex for x in range(vertex)]
        self.size = vertex
    
    def add_edge(self,src,dest):
        if(self.size > src >= 0 and self.size > dest >= 0):
            self.mat[src][dest] = 1
            self.mat[dest][src] = 1
        else:
            print("Invalid!!!!!")

    def Display(self):
        for row in self.mat:
            print(' '.join(map(str,row)))

    ### DFS-> Function
    
    def DFS(self, src):
        
        # Visted Array=> List-> 0
        visited = [False] * self.size

        # Stack=> List 
        stack = [src]

        # Loop to check.
        while(stack):
            v = stack.pop()

            if (visited[v] == False):
                print(v, end= " -> ")
                visited[v] = True
            
            for i in range(self.size):
                if self.mat[v][i] == 1 and visited[i] == False:
                    stack.append(i)

g = Graph(6)
g.add_edge(0,1)
g.add_edge(0,2)
g.add_edge(2,3)
g.add_edge(2,4)
g.add_edge(3,5)
g.add_edge(4,5)
g.DFS(0)