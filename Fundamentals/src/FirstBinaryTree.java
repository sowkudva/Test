
class Node{
	int key;
	Node left, right;
	public Node(int item) {
	
	key=item;
	left=right=null;
}
}

class FirstBinaryTree {
	 //define a root node 
	 Node root;
	 
	 //constructor
	 FirstBinaryTree(int key){
		 //key passed becomes the root node
		 root=new Node(key);
		// after this line
		//   root
		//   /  \
		//  /    \
		// null  null
	 }
	 FirstBinaryTree(){
		 root=null;
	 }
	 
	 static void inorder(Node temp) 
	    { 
	        if (temp == null) 
	            return; 
	       
	        inorder(temp.left); 
	        System.out.print(temp.key+" "); 
	        inorder(temp.right); 
	    } 

	public static void main (String[] args)

	{
		//object of binarytree class
		FirstBinaryTree btree = new FirstBinaryTree(30);
		
		btree.root.left=new Node(4);
		btree.root.right=new Node(40);
		btree.root.left.left=new Node(50);
		btree.root.left.right=new Node(60);
		btree.root.right.left=new Node(80);
		
		btree.root.right.right=new Node(90);
		inorder(btree.root); 
	}

}
