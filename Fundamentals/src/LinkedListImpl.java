
public class LinkedListImpl {
	
	
	//head of the linked list which is of type 'Node'
	//private Node head;
	
	//method to print the contents of the linbked list
	public void dispaly(Node head)
	{
		//if no elements, loop s returned
		if (head == null) {
			return;
		}
		//temp node which points to head
		Node current = head;
		
		//loop each element till the end of the list
		//Last node point s to null
		while(current != null)
		{
			System.out.print(current.data +" -->");
			current =current.next;
		}
		System.out.println(current);
	}
	
	//it contains a static inner class called Node to hold integer type data
	private static class Node
	
	{
		private int data;
		private Node next;
		
		//constructor which takes the new data to the node
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}

}
	//this  method is to find the length of the linked list
	public int length(Node head)
	{
		if (head== null)
		{
			return 0;
		}
		//counter to calculate length
		int count =0;
		Node current = head;
		while (current != null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	
	public static void main (String[] args)
	//linked list creation
	//10 ->8 ->1 ->11 ->null
	{
		Node head = new Node(10);
		Node second = new Node(8);
		Node third = new Node(1);
		Node fourth = new Node(11);
		
		//Attach the nodes to form linked list
		head.next=second;  //10 --> 8
		second.next=third; // 8 -->1
		third.next=fourth; //1 -->11
		
		//create an object of LinkedList impl class
		LinkedListImpl list = new LinkedListImpl();
		//call the display method passing head
		list.dispaly(head);
		//call the lenght method on the linked list class
		System.out.print("length of linked list "+list.length(head));
		
	}
}