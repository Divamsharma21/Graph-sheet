class Solution {
    public int fib(int n) {
        //  if (n == 0)
        //     return 0;
        // if (n == 1)
        //     return 1;

        // return fib(n - 1) + fib(n - 2);
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return memo(n,dp);
    }
    public int memo(int n,int[] dp){
         if (n == 0)
            return 0;
        if (n == 1)
            return 1;

            if(dp[n]!=-1) return dp[n];

            dp[n]=memo(n - 1,dp) + memo(n - 2,dp);

            int ans=dp[n];

            return ans;
    }

}