import java.io.*; 
import java.util.*; 


public class Main9
{
    public static  void merge(int arr1[] , int arr2[] , int m , int n)
    {
        int arr3[] = new int[m+n]; 
        int i = 0 , j = 0 , k = 0; 

        while(i < m && j < n)
        {
        	if(arr1[i] <= arr2[j])
        		arr3[k++] = arr1[i++]; 
        	else
        		arr3[k++] = arr2[j++]; 
        }

        while(i < m)
        	arr3[k++] = arr1[i++]; 
        
        while(j < n)
        	arr3[k++] = arr2[j++]; 
    	
    	for(int x : arr3)
    		System.out.print(x + " ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int m = sc.nextInt(); 
        int arr1[] = new int[m]; 
        for(int i = 0 ; i < m ; i++)
        	arr1[i] = sc.nextInt(); 

        int n = sc.nextInt(); 
        int arr2[] = new int[n]; 
        for(int i = 0 ; i < n ; i++)
        	arr2[i] = sc.nextInt(); 
    

        merge(arr1 , arr2 , m , n); 
    }
}