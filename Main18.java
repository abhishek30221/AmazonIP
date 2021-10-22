import java.io.*; 
import java.util.*; 


public class Main18
{
    public static int solve(int arr[] , int n)
    {
       int l = 0; 
       int r = n-1;
       while(l<=r)
       {
       		int mid = l + (r-l)/2; 

       		if(r == l + 1 && arr[r] >= arr[l])
       			return arr[r]; 
       		
       		else if(r == l + 1 && arr[r] < arr[l])
       			return arr[l];

			else if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
				return arr[mid]; 

       		else if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1])
       			r = mid - 1; 
       		
       		else l = mid + 1; 
       }
       return -1; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 		int arr[] = {1,2,3,4,5,6,5,4,3,2,1}; 
 		int n = arr.length; 
        System.out.println(solve(arr , n)); 

    }
}