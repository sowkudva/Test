import java.util.LinkedList;
import java.util.Queue;


public class HeightofBTree {
	
	static Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}
		
		
	}
	
	static void printNode(Node root, int start, int end) {
		if(root== null) {
			return;
		}
			Queue<Node> q = new LinkedList<Node>();
				q.add(root);
				
				int level=0;
				Node curr=null;
				
				while(!q.isEmpty())
				{
					level++;
					int size=q.size();
					
					while(size !=0) {
						curr=q.peek();
						q.poll();
						
						if(level >=start && level <=end) {
							System.out.print(curr.data+" ");
						}
							
						if(curr.left != null)
							q.add(curr.left);
						if(curr.right != null)
							q.add(curr.right);
						
						size--;
						}
						
						if(level >=start && level <=end) 
							System.out.print(" ");	
						
					
			}
		}
		
	
	
	//iterative
	static int heights(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int height=0;
		
		while(1==1) {
		int nodeCount=q.size();
		if(nodeCount==0)
			return height;
		height++;
		
			while(nodeCount !=0 )
			{
				Node nnode = q.peek();
				q.remove();
				if(nnode.left != null)
					q.add(nnode.left);
				if(nnode.right !=null)
					q.add(nnode.right);
				
				nodeCount--;
			
			}
			
		}
		
	}
	public static void main (String[] args) {
		root = new Node(1);
		root.left= new Node(2);
		root.right= new Node(3);
		root.left.left= new Node(4);
		root.left.right= new Node(5);
		root.right.left= new Node(6);
		root.right.right= new Node(7);
		System.out.println("Height of the tree is "+heights(root));
		
		printNode(root,2,3);
	}

}
