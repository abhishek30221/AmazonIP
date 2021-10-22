//ACQUIRE AND RELEASE CONCEPT
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       
        List<Integer> ans = new ArrayList<>(); 
        if(s.length() < p.length())
            return ans;
        HashMap<Character , Integer> shm = new HashMap<>(); 
        HashMap<Character , Integer> phm = new HashMap<>();
        
        //phm hashMap creation
        for(int k = 0 ; k < p.length() ; k++)
        {
            char c = p.charAt(k); 
            phm.put(c , phm.getOrDefault(c , 0) + 1); 
        }
        int matchcount = 0;  
        for(int i = 0 ; i < p.length() ; i++)
        {
            shm.put(s.charAt(i) , shm.getOrDefault(s.charAt(i) , 0) + 1); 
            if(shm.getOrDefault(s.charAt(i),0) <= phm.getOrDefault(s.charAt(i) , 0))
                 matchcount++; 
        }
        if(matchcount == p.length())
            ans.add(0);
        
        int i = 0; 
        int j = p.length();
        int n = s.length(); 
        
        while(j < n)
        {
            shm.put(s.charAt(j) , shm.getOrDefault(s.charAt(j),0) + 1);
            if(shm.getOrDefault(s.charAt(j),0) <= phm.getOrDefault(s.charAt(j) , 0))
                 matchcount++; 
            
            int x = shm.getOrDefault(s.charAt(i) , 0); 
            shm.put(s.charAt(i) , (x  == 0) ? 0 : x-1); 
            if(shm.getOrDefault(s.charAt(i),0) < phm.getOrDefault(s.charAt(i) , 0))
                 matchcount--; 
         
            i++; j++;
            if(matchcount == p.length())
                ans.add(i);
        }
        return ans; 
    }
}