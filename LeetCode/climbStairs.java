class Solution {
    public int dpf(int n, int[] dp) {
        if(n < 0)
            return 0;
        if(n == 0 || n == 1 )
            return 1;
        if(dp[n] != -1)
            return dp[n];
        
        int answer = dpf(n-1, dp) + (dpf(n-2, dp));

        dp[n] = answer;

        return answer;
    }

    public int climbStairs(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return dpf(n-2, dp) + dpf(n-1, dp);
    }
}
