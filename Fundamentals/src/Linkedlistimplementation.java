
class Linkedlistimplementation {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		//constructor
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public void printList() 
	{ 
		Node n = head; 
		while (n != null) 
		{ 
			System.out.print(n.data+" "); 
			n = n.next; 
		} 
	} 

	//to add the nodes at the first 
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	//to add elements at the given node 
	public void InserAfter(Node prev_node, int data)
	{
		if (prev_node == null)
		{
			System.out.println("previous Node cannot be null ");
			return;
		}
		else
		{
			Node new_node = new Node(data);
			new_node.next=prev_node.next;
			prev_node.next=new_node;
		}
			
		
	}
	//to append at the end of the linked list
	public void append(int data)

	//to delete the given node from the linked list 
	
	{   
		//make new data a node
		Node new_node= new Node(data);
		
		//if the list is empty
		if(head == null)
		{
			head=new_node;
		}
		
		//since it is going to be  the last node
		new_node.next=null;
		
		//create a new reference to last and assign to head  
		Node last = head;
		
		//loop until the last.next is not null
		while(last.next !=null)
		{
			last=last.next;
		}
		
		//once you find the last node, assign the last.next to the new node
		last.next=new_node;
	}
	
	public void DeletNode(int new_data)
	{
		//store the head node
		Node temp=head, prev=null;
		
		//if the head is the key
		if (temp != null && temp.data == new_data) 
        { 
            head = temp.next;
            					// Changed head 
            return; 
        } 
		//looping through linked list to search the element
		//keep track of prev node
		while(temp != null && temp.data != new_data)
		{
			prev=temp;
			temp=temp.next;
		}
		
		if(temp==null)
		
			return;
		//link the previous 's next node to temp's next node. thus unlinking
		prev.next= temp.next;
		
	}
	public int getCount()
	{
		Node temp=head;
		int count=0;
		while(temp !=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
		
	}
	public static void main (String[] args)
	{
		Linkedlistimplementation list = new Linkedlistimplementation();
		//assign values
		list.head=new Node(1);
		Node second= new Node(2);
		Node third = new Node(3);
		
		//link values with next node
		list.head.next=second;
		second.next=third;
		
		list.printList();
		System.out.println();
		
		list.push(6);
		list.printList();
		System.out.println();
		
		list.InserAfter(list.head.next.next.next, 12);
		list.printList();
		System.out.println();
		
		list.append(24);
		list.printList();
		System.out.println();
		
		list.DeletNode(3);
		list.printList();
		System.out.println();
		
		System.out.println(list.getCount());
		
	}

}
 