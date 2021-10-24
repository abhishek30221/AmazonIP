class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length; 
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                int temp = arr[i][j]; 
                arr[i][j] = arr[j][i]; 
                arr[j][i] = temp; 
            }
        }
        for(int i = 0 ; i < n ; i++)
            reverse(arr[i]);
    }
    public void reverse(int arr[])
    {
        int i = 0;
        int j = arr.length-1; 
        while(i < j)
        {
            int temp = arr[i]; 
            arr[i] = arr[j] ;
            arr[j]=temp; 
            i++; 
            j--;
        }
    }
}


class Main37
{
	public static void main(String[] args) {
		Solution sol = new Solution(); 
		int arr[][] = {{1,2,3} , {4,5,6} , {7,8,9}}; 
		int k = 2; 
		while(k-- > 0)
			sol.rotate(arr); 

        for(int[] t : arr)
        {
            for(int i : t)
                System.out.print(i + " "); 
            System.out.println(); 
        }
	}
}