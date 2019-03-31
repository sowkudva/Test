import java.util.LinkedList;

public class graphRepresenation {
	
	static class Graph{
		
		int V;
		LinkedList<Integer> adjListArray[];
		
		Graph(int V){
			this.V=V;
			adjListArray = new LinkedList[V] ;
			
			for(int i=0;i<V;i++) {
				adjListArray[i]= new LinkedList<>();
			}
		}
	}
	static void addEdge(Graph graph, int src, int dest) 
    { 
        // Add an edge from src to dest.  
        graph.adjListArray[src].add(dest); 
          
        // Since graph is undirected, add an edge from dest 
        // to src also 
        graph.adjListArray[dest].add(src); 
        
    } 
	
	static void printGraph(Graph graph) 
    {        
        for(int v = 0; v < graph.V; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head"); 
            for(Integer pCrawl: graph.adjListArray[v]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        } 
    } 
	public static void main (String[] args) {
		
		int V=5;
		
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
        
        printGraph(graph);
		
	}

}
