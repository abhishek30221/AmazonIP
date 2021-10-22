import java.io.*; 
import java.util.*; 


public class Main16
{
    public static  void solve(int arr[] , int n)
    {
    	//ngetr
        //Time : 0(n)
        int nge[] = new int[n]; 
        Stack<Integer> st = new Stack<>(); 
        //6 4 9  8  2  7
        //9 9 -1 -1 7 -1

        for(int i = 0 ; i < n ; i++)
        {
	        while(st.size() > 0 && arr[st.peek()] < arr[i])
	    	{
	    		nge[st.peek()] = arr[i]; 
	    		st.pop();
   	       	}
   	       	st.push(i); 
   	    }

        while(st.size() > 0)
        {
            nge[st.peek()] = -1;
            st.pop(); 
        }
        
   	    for(int i : nge)
   	    {
   	    	System.out.print(i + " "); 
   	    }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n =  sc.nextInt(); 
        int arr[] = new int[n]; 
        
        for(int i = 0 ; i < n ; i++)
        	arr[i] =  sc.nextInt();

        solve(arr , n); 

    }
}
