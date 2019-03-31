//o(n) an O(1)

public class NthElementLinkedList {
	
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
	
	public void printList(Node node)
	{
		while(node != null)
		{
			System.out.println(node.data+" ");
			node= node.next;
		}
	}
	
	public int NthElement(Node head,int N)
	{
		int count=0;
		Node current=head;
		
		while(current != null)
		{  
			
			if (count == N)
			return current.data;
		else
		{
			count++;
			current=current.next;
		}
	}
		return 0;
	}
	
	//rempve duplicates
	void removeDuplicates()
	{
		Node current=head;
		
		//new pointer initialized
		Node next_next;
		
		if(head== null)
			return;
		//since we are comparing current with current next, we have to go through the loop
		// until current.next is not null.
		while(current.next !=null)
		{
			if(current.data == current.next.data)
			{
				next_next=current.next.next;
				current.next=null;
				current.next=next_next;
				
			}
			else
				current= current.next;
		}
	}
	void printMiddle()
	{
		Node slow_pointer=head;
		Node fast_pointer=head;
		
		if(head != null)
		{
			while(fast_pointer !=null && fast_pointer.next !=null)
			{
				fast_pointer=fast_pointer.next.next;
				slow_pointer=slow_pointer.next;
			}
			System.out.println("Middle element is "+slow_pointer.data);
		}
	}
	
	public int MaxElement(Node node)
	{
		Node current= head;
		int max=current.data;
		while(current.next != null)
			
		{
			if ((current.next.data) > max)
				
			{
				max =current.next.data;
			}
			else
				current=current.next;
		}
		
		return max;
	}
	
	public int MinElement(Node node)
	{
		Node current= head;
		int min=current.data;
		while(current.next != null)
			
		{
			if ((current.next.data) < min)
				
			{
				min =current.next.data;
			}
			else
				current=current.next;
		}
		
		return min;
	}
	
	public static void main (String[] args)
	{
		NthElementLinkedList list = new NthElementLinkedList();
		head= new Node(20);
		head.next=new Node(30);
		head.next.next= new Node(40);
		head.next.next.next= new Node(50);
		head.next.next.next.next= new Node(70);
		head.next.next.next.next.next= new Node(70);
		
		
		
		list.printList(head);
		list.printMiddle(); 
		
		list.removeDuplicates();
		list.printList(head);
		
		System.out.println("Max element is "+list.MaxElement(head));
		
		System.out.println("Min element is "+list.MinElement(head));
		
		System.out.println(list.NthElement(head,3));
	
	}

}
