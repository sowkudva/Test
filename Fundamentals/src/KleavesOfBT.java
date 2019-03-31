


public class KleavesOfBT {
	
	 static Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	static int nodesOfKleaves(Node ptr, int k) {
		if(ptr== null)
			return 0;
		if(ptr.left== null && ptr.right==null)
			return 1;
		
		int total= nodesOfKleaves(ptr.left,k)+nodesOfKleaves(ptr.right,k);
		
		if(k==total)
			System.out.println(ptr.data+" ");
		
		
		return total;
		
		
	}
	
	
	public static void main (String[] args) {
		KleavesOfBT leaves = new KleavesOfBT();
		root= new Node(10);
		root.left= new Node(30);
		root.right= new Node(40);
		root.left.left= new Node(50);
		root.left.right= new Node(60);
		root.right.left=  new Node(70);
		//root.right.right= new Node(90);
		
		nodesOfKleaves(root,3);
		
		
	}

}
