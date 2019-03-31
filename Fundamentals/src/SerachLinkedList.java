
public class SerachLinkedList {
	
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
	
	public boolean searchElement(Node head,int n)
	{
		Node current= head;
		while(current !=null)
		{
			if(current.data == n)
			return true;
			current= current.next;	
		}
		
		return false;
	}
	
	public void printList(Node node)
	{
		while(node != null)
		{
			System.out.println(node.data+" ");
			node= node.next;
		}
	}
	
	public static void main (String[] args)
	{
		SerachLinkedList list = new SerachLinkedList();
		list.head= new Node(20);
		list.head.next=new Node(30);
		list.head.next.next= new Node(40);
		list.head.next.next.next= new Node(50);
		
		list.printList(head);
		System.out.println(list.searchElement(head,60));
		
		
		
	}

}
