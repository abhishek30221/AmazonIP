import java.io.*; 
import java.util.*; 


public class Main
{
    Stack<Integer> st = new Stack<>(); 
	
	public static void insert(int x)
	{
		if(st.isEmpty())
		{
			st.push(x); 
		}
		else
		{
			int a = st.peek();
			st.pop();  
			insert(x);
			st.push(a); 
		}
	}

    public static void solve()
    {
    	if(st.size() > 0)
    	{
    		int x = st.peek(); 
    		st.pop(); 
    		solve(); 
    		insert(x); 
    	}
    	else
    		System.out.println("Empty"); 
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        st.push(4); 
        st.push(3); 
        st.push(2); 
        st.push(1);
        solve(); 

    	while(st.size()>0)
    	{
    		System.out.print(st.peek() + " "); 
    		st.pop(); 
    	}
    }
}