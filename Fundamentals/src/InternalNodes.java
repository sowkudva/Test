import java.util.LinkedList;
import java.util.Queue;

public class InternalNodes {
	
	static Node root;
	
	static class Node{
		int data;
		Node right;
		Node left;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	static void interNodes(Node node)
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		
		while(!q.isEmpty()) {
			Node current=q.peek();
			q.remove();
			boolean isInternal =false;
			
			if(current.left !=null)
			{
				isInternal=true;
				q.add(current.left);
			}
			
			if(current.right != null)
			{
				isInternal= true;
				q.add(current.right);
			}
			
			if(isInternal == true)
			{
				System.out.println(current.data+" ");
				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		
		InternalNodes nodes = new InternalNodes();
		root= new Node(1);
		root.left= new Node(2);
		root.right=new Node(3);
		root.right.right=new Node(6);
		root.right.right.right=new Node(10);
		root.right.right.left=new Node(7);
		root.right.left = new Node(5);
		root.right.left.left = new Node(8);
		root.right.left.right=   new Node(9);
		root.left.left=new Node(4);
		
		interNodes(root);
	}

}
