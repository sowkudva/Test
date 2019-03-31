//BFS traversal using queue 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSinGraph {
	
static class Graph{
		int V;
		LinkedList adj[];
		Graph(int v){
			V=v;
			adj=new LinkedList[V];
			
			for(int i=0;i<V;i++) {
				adj[i]= new LinkedList();
			}
			
			
		}
	
void addEdge(Graph g,int v,int w) {
	g.adj[v].add(w);
}

void BFS(int s) {
	
	boolean visited[] = new boolean[V];
	
	Queue<Integer> q= new LinkedList<Integer>();
	
	
	visited[s]= true;
	q.add(s);
	
	while(!(q.size() ==0)) {
		s=q.poll();
		System.out.println(s+" ");
		
		Iterator<Integer> i = adj[s].listIterator();
		//System.out.print("value of i "+i.next());
		while (i.hasNext()) 
		{ 
			int n = i.next(); 
			if (!visited[n]) 
			{ 
				visited[n] = true; 
				q.add(n); 
			} 
		} 
		
	}
	
	
}
}

public static void main (String[] args) {
	
	int V=4;
	Graph g= new Graph(V);
	
	g.addEdge(g,0, 1); 
	g.addEdge(g,0, 2); 
	g.addEdge(g,1, 2); 
	g.addEdge(g,2, 0); 
	g.addEdge(g,2, 3); 
	g.addEdge(g,3, 3); 

    g.BFS(0);
	
}

}
