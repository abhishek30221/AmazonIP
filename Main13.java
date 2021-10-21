import java.io.*; 
import java.util.*; 


public class Main
{
	public static class Node
	{
		int data; 
		Node left; 
		Node right; 
		Node(int data)
		{this.data = data;}
	}

	int ans = -1; 
	public static Node LCA(Node root , int n1 , int n2)
	{
		if(root == null)
			return root; 

		Node left = LCA(root.left , n1 , n2); 
		Node right = LCA(root.right , n1 , n2); 
		
		if(left==null && right == null)
		{
			if(root.data == n1 || root.data == n2)
				return root; 
			return null; 
		}
		else if(left != null && right == null)
		{
			if(root.data == n1 || root.data == n2)
				return root; 
			return left; 
		}
	
		else if(left == null && right != null)
		{
			if(root.data == n1 || root.data == n2)
				return root; 
			return right; 
		}
		else
		{
			ans = root.data; 
			return root;
		}
	}
	public static int dist(Node root , int a , int level)
	{
		if(root == null)
			return 0; 
		
		if(root.data == a)
			return level; 

		int left = dist(root.left , a , level+1); 
		if(left==-1)
			return dist(root.right , a , level+1); 
		return left;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
       
        Node root = new Node(10); 

        int ans = dist(root , n1.data) + dist(root , n2.data) - 2*lca(root , n1.data , n2.data); 
        System.out.println(ans);
    }
}