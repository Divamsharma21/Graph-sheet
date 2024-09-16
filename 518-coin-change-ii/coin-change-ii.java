// class Solution {

    // int[][] dp;

    // public int change(int amount, int[] coins) {
    // int n = coins.length;
    // dp = new int[n][amount+ 1];
    // for(int[] row:dp)
    // {
    // Arrays.fill(row,-1);
    // }

    // return solve(amount, coins, coins.length - 1);
    // }

    // public int solve(int amount, int[] coins, int idx) {

    // if (amount == 0) {

    // return 1;
    // }
    // if (idx < 0 || amount < 0){

    // return 0;
    // }

    // if (dp[idx][amount]!= -1){

    // return dp[idx][amount];
    // }

    // int take = solve(amount - coins[idx], coins, idx);
    // int nottake = solve(amount, coins, idx - 1);

    // return dp[idx][amount] = take + nottake;

//     //Tabulation
// class Solution {
//     public int change(int T,int arr[]) {
//        int n = arr.length;
//         int dp[][]=new int[n][T+1];
//     //Initializing base condition
//     for(int i=0;i<=T;i++){
//         if(i%arr[0]==0)
//             dp[0][i]=1;
//         // Else condition is automatically fulfilled,
//         // as dp array is initialized to zero
//     }
//     for(int ind=1; ind<n;ind++){
//         for(int target=0;target<=T;target++){
//             int notTaken = dp[ind-1][target];
            
//             int taken = 0;
//             if(arr[ind]<=target)
//                 taken = dp[ind][target-arr[ind]];
                
//             dp[ind][target] = notTaken + taken;
//         }
//     }
    
//     return dp[n-1][T];
//     }
// }
 
 

 //Space optimized Tabulation
class Solution {
    public int change(int T,int arr[]) {
       int n = arr.length;
        // int dp[][]=new int[n][T+1];
    int prev[] = new int[T+1];
        //Initializing base condition
    for(int i=0;i<=T;i++){
        if(i%arr[0]==0)
            prev[i]=1;
        // Else condition is automatically fulfilled,
        // as dp array is initialized to zero
    }
    for(int ind=1; ind<n;ind++){
        for(int target=0;target<=T;target++){
            int notTaken = prev[target];
            
            int taken = 0;
            if(arr[ind]<=target)
                taken = prev[target-arr[ind]];
                
            prev[target] = notTaken + taken;
        }
    }
    
    return prev[T];
    }
}