import java.io.*; 
import java.util.*; 


public class Main32
{
    public static void solve(int arr[] , int n, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for(int i = 0 ; i < n ; i++)
        {
            if(i < k)
                pq.add(arr[i]); 
            else
            {
                if(pq.peek() < arr[i])
                {
                    pq.remove(pq.peek()); 
                    pq.add(arr[i]); 
                }
            }
        }
        while(pq.size() > 0)
        {
            System.out.print(pq.peek() + " "); 
            pq.remove(); 
        }
    }
    
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    	int n = Integer.parseInt(br.readLine()); 
        String str[] = br.readLine().split(" "); 
        int arr[] = new int[n]; 
        for(int i = 0 ; i< n ; i++)
            arr[i] = Integer.parseInt(str[i]); 

        int k = Integer.parseInt(br.readLine()); 
        
        solve(arr,n,k); 

    }
}


// TIME COMPLEXITY : 0(nlog(k)); 
// SPACE COMPLEXITY: 0(k)