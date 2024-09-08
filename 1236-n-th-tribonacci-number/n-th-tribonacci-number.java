class Solution {
    public int tribonacci(int n) {
        // if(n==0) return 0;
        // if(n==1 || n==2) return 1;

        // return tribonacci(n-1)+ tribonacci(n-2) +tribonacci(n-3);

        // this is tabulation solution

    //     int[] dp = new int[n + 2];
    //    if(n<=0) return 0;
    //     dp[0] = 0;
    //     dp[1] = 1;
    //     dp[2] = 1;

    //     for (int i = 3; i <= n; i++) {
    //         dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]  ;
    //     }
    //     int ans = dp[n];
    //     return ans;


    if(n<=0) return 0;   
   int prev1=0;
   int prev2=1;
   int prev3=1;

   for(int i=3;i<=n;i++){
    int curr=prev1+prev2+prev3;
    prev1=prev2;
    prev2=prev3;
    prev3=curr;

   }

   return prev3;
    }
}