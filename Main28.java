import java.io.*; 
import java.util.*; 


public class Main28
{
    public static  void solve(int n)
    {
 	       System.out.println((n * (n-1)) / 2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 		int n = sc.nextInt(); 
        solve(n); 

    }
}