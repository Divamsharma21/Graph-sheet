class Solution {
     public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp=new int[m+1][n+1];
         for(int[] i:dp){
            Arrays.fill(i,0);
         }

        return f(grid, m - 1, n - 1,dp);
    }
    private int f(int[][] grid, int m, int n,int[][] dp){
        if(m == 0 && n == 0)
            return grid[m][n];
        if(m < 0 || n < 0)
            return Integer.MAX_VALUE;
            if(dp[m][n]!=0){
                return dp[m][n];
            }

        int a = f(grid, m - 1, n,dp);
        int b = f(grid, m, n - 1,dp);
        
        dp[m][n]= Math.min(a, b) + grid[m][n];
        return dp[m][n];
    }
}