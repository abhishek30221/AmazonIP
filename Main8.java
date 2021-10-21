import java.io.*; 
import java.util.*; 


public class Main8
{
    public static void solve(int arr[] , int n)
    {
        int total = (n+1) * (n+2) / 2;
    	for(int i : arr)
    		total -= i; 

    	System.out.println(total); 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        for(int i = 0 ; i < n ; i++)
        	arr[i] = sc.nextInt();
       	solve(arr , n); 
    }
}