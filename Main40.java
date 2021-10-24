import java.io.*;
class Main30 {
	
	static int maxSum(int arr[], int n)
	{
		if (n < 2)
			return -1;
		int ans = arr[0] + arr[1];
		for (int i = 1; i + 1 < n; i++)
			ans = Math.min(ans, (arr[i]
						+ arr[i + 1]));
		return ans;
	}
	
	public static void main (String[] args)
	{
		int arr[] = {1, 12, 2, 2};
		int n = arr.length;
		
		System.out.println( maxSum(arr, n));
	}
}

