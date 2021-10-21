class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>(); 
        HashMap<String , ArrayList<String>> hm = new HashMap<>(); 
        int freq[] = new int[26]; 
        
        for(String s : strs)
        {
            for(char c : s.toCharArray())
                freq[c - 'a']++;
            
            StringBuilder hash = new StringBuilder(); 
            for(int i : freq)
            {
                hash.append(i); 
                hash.append("_"); 
            }
            Arrays.fill(freq , 0);             
            String t = hash.toString();
            if(!hm.containsKey(t))
            {
                ArrayList<String> x = new ArrayList<>(); 
                x.add(s); 
                hm.put(t , x); 
            }
            else{
                hm.get(t).add(s); 
            }
        }
        for(String k : hm.keySet())
        {
            ArrayList<String> t = hm.get(k); 
            ans.add(t);  
        }
        return ans; 
    }
}