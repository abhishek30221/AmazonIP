class Main36
{
	Node head; 
	class Node
	{
		int data; 
		Node next; 
		Node(int d)
		{
		 	this.data = data;
			next = null; 
		}
	}
	public void printfromlast(int n)
	{
		int count = 0; 
		Node temp = head; 
		
		while(temp != null)
		{
			System.out.println(temp.data + " ");
			temp = temp.next; 
			count++; 
		}
		System.out.println(count); 
		if(count < n)
			return; 
		
		temp = head; 
		
		for(int i = 1 ; i < (count-n+1) ; i++)
		{
			temp = temp.next; 
		}
		System.out.print(temp.data); 
	}
	public void push(int n)
	{
		Node newnode = new Node(n);
		newnode.next = head; 
		head = newnode; 
	}
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist(); 
		ll.push(20); 
		ll.push(4); 
		ll.push(15); 
		ll.push(35); 
		ll.push(80); 
		ll.push(70); 
		ll.push(10); 
		ll.printfromlast(4);
	}
}