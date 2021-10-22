import java.io.*; 
import java.util.*; 


public class Main19
{
    public static int solve(int arr[][])
    {
        Stack<Integer> st = new Stack<>(); 
        for(int i = 0 ; i < arr.length ; i++)
        	st.push(i); 

        while(st.size() >= 2)
        {
        	int m = st.pop(); 
        	int n = st.pop(); 

        	if(arr[m][n] == 1)
        	{
        		st.push(n); 
        	}
        	else{
        		st.push(m); 
        	}
        }

        int pot = st.pop(); 
        for(int i = 0 ; i < arr.length ; i++)
        {
        	if(i!=pot)
    		{
    			if(arr[i][pot] == 0 || arr[pot][i] == 1)
    			{
    				System.out.println("none"); 
    				return -1;
    			}
    		}
        }
        return pot; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int arr[][] = {{0,1,1,1} , {1,0,1,0} , {0,0,0,0} , {1,1,1,0}};
        System.out.println(solve(arr)); 
    }
}
