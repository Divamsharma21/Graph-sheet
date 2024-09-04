class Solution {

    // this is recursion and memo solution
    // public int rob(int[] nums) {
    // int n=nums.length;
    // int[] dp=new int[n+1];
    // Arrays.fill(dp,0);
    // return maxrob(nums,n-1,dp);
    // }

    // public int maxrob(int[] nums,int n,int[] dp){
    // if(n<0) return 0;
    // if(dp[n]!=0) return dp[n];

    // dp[n]= Math.max(maxrob(nums,n-1,dp),maxrob(nums,n-2,dp)+nums[n]);

    // return dp[n];

    // }

    // this is tabulation solution

    // public int rob(int[] nums) {
    //     int n = nums.length;

    //     if (n == 1) {
    //         return nums[0];
    //     }
    //     int[] dp = new int[n + 1];
    //     dp[0] = nums[0];
    //     dp[1] = Math.max(nums[0], nums[1]);

    //     for (int i = 2; i < n; i++) {

    //         dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
    //     }

    //     return dp[n - 1];

    // }

    // this is space optimization


     public int rob(int[] nums) {
        int n = nums.length;
 
        int prev = nums[0];
        
           int prev2=0;

        for (int i = 1; i < n; i++) {

            int curr= Math.max(prev, prev2 + nums[i]);
            prev2=prev;
            prev=curr;
        }

        return prev;

    }
}