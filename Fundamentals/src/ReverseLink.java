
public class ReverseLink {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	//this is different from prev impl cz here we are passing head node
	public void printList(Node node) {
		
		while(node != null)
		{
			System.out.print(node.data + " "); 
			node=node.next;
		}
	}
	
	public Node reverse(Node n)
	{
		Node prev=null;
		Node next=null;
		Node current=n;
		
		while(current != null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		n= prev;
		
		return n;
		
	}
	
	public static void main (String[] args)
	{
		ReverseLink list = new ReverseLink();
		list.head= new Node(10);
		Node second= new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		
		System.out.println("Given List");
		list.printList(head);
		
		System.out.println("After reverse List");
		//stored the head afger reverse to pass into reverse function
		head=list.reverse(head);
		list.printList(head);
		
	}

}
