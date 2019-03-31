
public class PrintNodesBetweenRange {
	
	static Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	public static void main (String[] args) {
		root = new Node(10);
		root.left= new Node(20);
		root.right= new Node(30);
		
		
		
	}

}
