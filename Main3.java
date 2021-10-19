import java.io.*; 
import java.util.*; 

public class Main
{
	int ans = -1; 
	Node lca(Node root, int n1,int n2)
	{
		if(root == null)
		    return null; 
		
		Node left =  lca(root.left , n1 , n2); 
		Node right = lca(root.right , n1 , n2); 
		
		if(left == null && right == null)
		{
		    if(root.data == n1 || root.data == n2)
		    {
		        return root;
		    }
		    return null;
		}
		if(left != null && right == null)
		{
		    if(root.data == n1 || root.data == n2)
		    {
		        return root;
		    }
		    return left;
		}
		if(left == null && right != null)
		{
		    if(root.data == n1 || root.data == n2)
		    {
		        return root;
		    }
		    return right;
		}
	    ans  = root.data; 
	    return root; 
	}
}