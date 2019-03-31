

public class DupliactesInUnsortedArray {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
		
		void push(int new_data)
		
		{
			Node new_node= new Node(new_data);
			new_node.next=head;
			head=new_node;
		}
		
		void removeDups(Node node) {
			Node current=head;
			Node next_next;
			
			if (head == null)	 
				return;
			while(current.next != null)
			{
				if(current.data == current.next.data) {
					next_next=current.next.next;
					current.next=null;
					current.next=next_next;
				}
				else
					current=current.next;
			}
		}
		
		public void printList()
		{
			Node n=head;
			while(n != null)
			{
				System.out.println(n.data+" ");
				n= n.next;
			}
		}
		
		public static void main(String[] args)
		{
			DupliactesInUnsortedArray llist = new DupliactesInUnsortedArray();
			
			llist.push(20);
			llist.push(14);
			llist.push(13);
			llist.push(12);
			llist.push(21);
			llist.push(28);
			llist.push(22);
			llist.push(20);
			
			llist.printList();
			
			
			System.out.println("After removing duplicates");
			llist.removeDups(head);
			llist.printList();
		}
	
	
		
	}


