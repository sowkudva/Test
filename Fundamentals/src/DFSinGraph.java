//deapth first traversal using stack

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFSinGraph {

	
	static class Graph{
		int V;
		LinkedList<Integer>  adj[];
		Graph(int v){
			V=v;
			adj= new LinkedList[V];
			
			for(int i=0;i<V ;i++) {
				adj[i]=new LinkedList();
			}
			
		}
		
		void addEdge(int u,int v) {
			adj[u].add(v);
			
		}
		
		void DFS(int s) {
			boolean visited[] = new boolean[V];
			
			Stack<Integer> st = new Stack<Integer>();
			visited[s]=true;
			st.push(s);
			
			while(st.empty()==false) {
				
				s = st.pop();  
				System.out.println(s+" ");
                
                
                Iterator<Integer> i = adj[s].listIterator();
        		//System.out.print("value of i "+i.next());
        		while (i.hasNext()) 
        		{ 
        			int n = i.next(); 
        			if (!visited[n]) 
        			{ 
        				visited[n] = true; 
        				st.push(n); 
        			} 
        		} 
				
			}
			
			
			
		}
	
	
	int DFSmod(int src,int dest) {
		boolean visited[] = new boolean[V];
		int count=0;
		Stack<Integer> st = new Stack<Integer>();
		//visited[src]=true;
		st.push(src);
		
		while(st.empty()==false) {
			
			src = st.pop();  
			//System.out.println(src+" ");
            
            
            Iterator<Integer> i = adj[src].listIterator();
    		//System.out.print("value of i "+i.next());
    		while (i.hasNext()) 
    		{ 
    			int n = i.next(); 
    			
    			if (!visited[n]) 
    			{ 
    				visited[n] = true; 
    				st.push(n); 
    			} 
    			if (n == dest)
    			{
    				count++;
    				visited[n] = false;
    			}
    		} 
			
		}
		
		return count;
		
	}
}
	
	public static void main (String[] args) {
		
		int V =4;
		Graph g= new Graph(V);
		
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(2, 0); 
        g.addEdge(2, 1); 
        g.addEdge(1, 3); 

	    g.DFS(0);
	    System.out.println("count of path "+g.DFSmod(2,3));
	}
}
