import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().hasArrayTwoCandidates(arr, n, x);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
       int i = 0; 
       int j = n-1; 
       Arrays.sort(arr); 
       while(i < j)
       {
           if(arr[i] + arr[j] == x)
           {
               return true;
           }
           else if(arr[i] + arr[j] > x)
                j--; 
           else 
                i++;
       }
       return false; 
            
    }
}