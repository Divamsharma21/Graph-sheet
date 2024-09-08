class Solution {
 
    public int climbStairs(int n) {
        //this is recursion
        //     if(n==0 || n==1  )  return 1;
        // return climbStairs(n-1)+climbStairs(n-2);
        int [] dp=new int[n+1];
        Arrays.fill(dp,0);
        return memo(n,dp);
        


    }

    public int memo(int n,int[] dp){
         if(n==0 || n==1  )  return 1;

         if(dp[n]!=0) return dp[n];
        dp[n] =memo(n-1,dp)+memo(n-2,dp);

        return dp[n];
    }
}