import java.util.*; 
import java.io.*; 


class Node
{
    int val; 
     Node left , right; 
     Node(int val)
     {
        this.val = val;
        left = right = null; 
     }
}

class Main31 {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='null')
            return null;
        
        
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        int i = 1;

        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("null")) 
            {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
                
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
            if(!currVal.equals("null")) 
            {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    static void printpre(Node root)
    {
        if(root == null)
            return;
            
        System.out.print(root.val+" ");
        printpre(root.left);
        printpre(root.right);
    }
    
    public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());

            while(t-- > 0)
            {
                String s = br.readLine();
                Node root = buildTree(s);
                Tree g = new Tree();
                g.solve(root); 
                printpre(root); 
            }
    }
}

class Tree
{
    int sum = 0; 
    public void solve(Node root)
    {
        if(root == null)
        {
            return; 
        }

        solve(root.right); 
        sum += root.val; 
        root.val = sum; 
        solve(root.left); 
    }
}