import java.util.*; 
import java.io.*; 

class Node
{
	int val; 
	Node left , right; 
	public Node(int val)
	{this.val = val; left = right = null;}
}

class Main35
{
	public static Node create(String str)
	{
		if(str.length() ==0)
			return null; 

		String ip[] = str.split(" "); 
		Node root = new Node(Integer.valueOf(ip[0]));
		Queue<Node> q = new LinkedList<>(); 
		q.add(root); 
		int i = 1;
		
		while(q.size() > 0 && i < ip.length)
		{
			Node currNode = q.peek(); 
			q.remove();
			String currVal = (ip[i]); 
			if(!currVal.equals("null"))
			{
				currNode.left = new Node(Integer.valueOf(currVal)); 
				q.add(currNode.left); 
			}
			i++; 
			if(i >= ip.length)
				{break;}

			currVal = ip[i]; 
			if(!currVal.equals("null"))
			{
				currNode.right = new Node(Integer.valueOf(currVal));
				q.add(currNode.right); 
			}
			i++;
		}
		return root; 
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String str = br.readLine();  
		Node root = create(str); 
		Imp i = new Imp(); 
		i.verticalsum(root); 
	}	
}

class Imp
{
	public class Pair
	{
		Node n; 
		int vlevel; 
		Pair(Node n , int vlevel)
		{
			this.n = n; 
			this.vlevel = vlevel; 
		}
	}
	public void verticalsum(Node root)
	{
		HashMap<Integer , ArrayList<Integer>> hm = new HashMap<>(); 
		Queue<Pair> q = new LinkedList<>(); 
		q.add(new Pair(root , 0)); 
		
		while(q.size() > 0)
		{
			int size = q.size(); 
			while(size-- > 0)
			{
				Pair rem = q.peek();
				q.remove();  
				if(hm.containsKey(rem.vlevel)==false)
				{
					ArrayList<Integer> arr = new ArrayList<>(); 
					arr.add(rem.n.val); 
					hm.put(rem.vlevel,arr); 
				}
				else
				{
					hm.get(rem.vlevel).add(rem.n.val); 
				}

				if(rem.n.left != null)
				{
					q.add(new Pair(rem.n.left , rem.vlevel-1)); 
				}
				if(rem.n.right != null)
				{
					q.add(new Pair(rem.n.right , rem.vlevel+1)); 
				}
			}
		}

		int minim = Integer.MAX_VALUE;
        int maxim = Integer.MIN_VALUE;
        for(int elem : hm.keySet())
        {
        		System.out.println(hm.get(elem)); 
            minim = Math.min(minim,elem);
            maxim = Math.max(maxim,elem);
        }
        ArrayList<Integer> ans = new ArrayList<>(); 

        for(int i = minim; i <= maxim; i++)
        {
    	   int sum = 0; 
           ArrayList<Integer> temp = hm.get(i); 
           for(int j : temp)
           	sum += j; 
           System.out.print(sum + " ");
        }
     
	}
}