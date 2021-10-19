class Solution {
    public int maxProfit(int[] prices) {
        int dp_i10 = 0;
        int dp_i11 = Integer.MIN_VALUE;
        for(int val : prices)
        {
            dp_i10 = Math.max(dp_i10 , dp_i11 + val);
            dp_i11 = Math.max(dp_i11 , -val); 
        }
        return dp_i10;
    }
}