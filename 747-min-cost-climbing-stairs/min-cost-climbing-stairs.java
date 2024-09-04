class Solution {

    // Recursive Top Down - O(2^n) Time Limit Exceeded
    // this is memorization
    // public int minCostClimbingStairs(int[] cost) {
    // int n = cost.length;
    // int[] dp=new int[n+1];
    // Arrays.fill(dp,0);
    // return Math.min(minCost(cost, n - 1,dp), minCost(cost, n - 2,dp));
    // }

    // private int minCost(int[] cost, int n,int[] dp) {
    // if (n < 0)
    // return 0;
    // if (n == 0 || n == 1)
    // return cost[n];

    // if(dp[n]!=0){
    // return dp[n];
    // }
    // dp[n]= cost[n]+ Math.min(minCost(cost, n - 1,dp), minCost(cost, n - 2,dp));
    // return dp[n];
    // }
    // }

    // this is taqbulation

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2)
                dp[i] = cost[i];
            else
                dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n - 1], dp[n - 2]);

        
    }
}