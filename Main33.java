import java.io.*; 
import java.util.*; 

public class Main33
{
    public static  void solve(String str , int n)
    {
        int count = 0;
        int freq[] = new int[26];

        for(char c : str.toCharArray())
            freq[c-'a']++;

        for(int i = 0 ; i < 26 ; i++)
            if(freq[i]>1)
                count++;

        System.out.println(count); 
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = br.readLine(); 
        solve(str , str.length()); 
    }
}