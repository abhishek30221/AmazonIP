class Main41
{
	Node head; 

	class Node
	{
		int data; 
		Node next; 
		Node(int data)
		{  this.data = data; next = null; }
	}

	void pairwiseswap()
	{
		Node temp = head; 
		while(temp != null && temp.next != null)
		{
			int k = temp.data; 
			temp.data = temp.next.data; 
			temp.next.data = k;
			temp = temp.next.next; 
		}
	}
	public void push(int n) //pushing at start
	{
		Node newNode = new Node(n); 
		newNode.next = head; 
		head = newNode; 
	}
	public void print()
	{
		Node temp = head; 

		while(temp != null)
		{
			System.out.print(temp.data + " "); 
			temp = temp.next; 
		}
	}
	public static void main(String[] args) {
		Main40 m = new Main40(); 
		m.push(10);
		m.push(20);
		m.push(30);
		m.push(40);
		m.push(50);
		m.pairwiseswap();
		m.print();
	}
}