class Solution {

    int[][] dp;

    public int change(int amount, int[] coins) {
        int n = coins.length;
        dp = new int[n][amount+ 1];
      for(int[] row:dp)
       {
           Arrays.fill(row,-1);
       }

        return solve(amount, coins, coins.length - 1);
    }

    public int solve(int amount, int[] coins, int idx) {

        if (amount == 0) {

            return 1;
        }
        if (idx < 0 || amount < 0){

            return 0;
        }

        if (dp[idx][amount]!= -1){

            return dp[idx][amount];
        }

        int take = solve(amount - coins[idx], coins, idx);
        int nottake = solve(amount, coins, idx - 1);

        return dp[idx][amount] = take + nottake;
    }
}