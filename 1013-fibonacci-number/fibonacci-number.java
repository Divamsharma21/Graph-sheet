class Solution {
    public int fib(int n) {
        //  if (n == 0)
        //     return 0;
        // if (n == 1)
        //     return 1;

        // return fib(n - 1) + fib(n - 2);
        // int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);

        // return memo(n,dp);

        // this is tabulation
        // int[] dp=new int[n+1];
        // dp[0]=0;
        // dp[1]=1;

        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];

        // }

        // int ans=dp[n];

        // return ans;
        if(n==0) return 0;
        if(n==1) return 1;
        int prev=1;
        int next=1;
        for(int  i=3;i<=n;i++){
            int curr=prev+next;
            prev=next;
            next=curr;
        }
        return next;                        
    }
    // public int memo(int n,int[] dp){
    //      if (n == 0)
    //         return 0;
    //     if (n == 1)
    //         return 1;

    //         if(dp[n]!=-1) return dp[n];

    //         dp[n]=memo(n - 1,dp) + memo(n - 2,dp);

    //         int ans=dp[n];

    //         return ans;
    // }

}