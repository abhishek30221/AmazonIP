//KADENES ALGORITHM

class Solution {
    public int maxSubArray(int[] nums) {
        int cmax = 0; 
        int omax = Integer.MIN_VALUE; 
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            cmax = (cmax >= 0) ?  cmax + nums[i] : nums[i]; 
            omax = Math.max(omax , cmax); 
        }
        return omax; 
    }
}