package stack;

public class stacklinked {
	Node head=null;
	Node prev;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}

	public void push(int ds){
		Node new_node=new Node(ds);
		if(head==null){
			head=new_node;
			return;
		}
		Node n=head;
		new_node.next=null;
		while(n.next!=null)
		n=n.next;
		n.next=new_node;
		
		
	}
	
	public void pop(){
	
		if(head==null){
			System.out.println("stack underflow");
		}
		Node n= head;
		
		while(n.next!=null){
			prev=n;
			n=n.next;
			System.out.println("iam here");
		}
		prev.next=null;
	}
	public void print(){
		Node n=head;
		while(n!=null){
		System.out.println(n.data);
		n=n.next;
	}
	}
	public static void main(String[] args){
		stacklinked s=new stacklinked();
	
		s.push(3);
		s.push(4);
		s.pop();
		/**s.pop();
		s.push(5);
		s.push(4);
		s.push(7);
		
		*/
		s.print();
		System.out.println(10+2+"3");
	}

}
