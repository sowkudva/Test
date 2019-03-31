import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTravesrsal {
	
	static Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	static void printLevelorder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node tempNode=q.poll();
			System.out.println(tempNode.data+" ");
			
			if(tempNode.left !=null)
				q.add(tempNode.left);
			
			if(tempNode.right !=null)
				q.add(tempNode.right);
			
				
		}
		
		
		
	}
	
	public static void main (String[] args)
	{
		//LevelOrderTravesrsal order = new LevelOrderTravesrsal();
		root= new Node(1);
		root.left= new Node(2);
		root.right= new Node(3);
		root.left.left= new Node(4);
		root.left.right= new Node(5);
		printLevelorder(root);
		
	}

}
