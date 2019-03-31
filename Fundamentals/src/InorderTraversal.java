import java.util.LinkedList;
import java.util.Queue;

//perfect program.
class InorderTraversal {
	
	 Node root;
	 Node temp=root;
	
	static class Node{
		int key;
		Node right, left;
		Node(int k){
			key=k;
			right=left=null;
		}
		
	}
	
	static void insertElement(Node temp,int key) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		
		while(! q.isEmpty()) {
			temp=q.peek(); // assign the first element in the que to temp and remove it
			q.remove(); // remove it cz next iteration should pick the next element in the queue
			
			if(temp.left == null) {
				temp.left = new Node(key);
				break;
			}
			else
				q.add(temp.left);
			
			if(temp.right == null) {
				temp.right= new Node(key);
				break;
			}
			else
				q.add(temp.right);
				
		
		}
	}
	
	
	static void inOrderTrav(Node node) {
		if (node == null)
			return;
		else
			inOrderTrav(node.left);
			System.out.println(node.key+" ");
			inOrderTrav(node.right);
		
	}
	
	public static void main (String[] args) {
		
		InorderTraversal travel= new InorderTraversal();
		
		travel.root= new Node(10);
		travel.root.left= new Node(20);
		travel.root.right= new Node(30);
		travel.root.left.left = new Node(40);
		travel.root.left.right=new Node(50);
		travel.root.right.left= new Node(60);
		//travel.root.right.right= new Node(70);
		inOrderTrav(travel.root);
		
		insertElement(travel.root, 100);
		inOrderTrav(travel.root);
	}
	

}
