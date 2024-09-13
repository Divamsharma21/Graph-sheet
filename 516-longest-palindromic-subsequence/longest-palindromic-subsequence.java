class Solution {
    // public int longestPalindromeSubseq(String s) {
    // int[][] dp=new int[s.length()+1][s.length()+1];

    // return lps(s, 0, s.length()-1,dp);
    // }
    // private int lps(String s, int i, int j,int[][] dp) {
    // if( i > j) return 0;
    // if( i == j ) return 1;
    // if(dp[i][j]!=0) return dp[i][j];
    // if(s.charAt(i) == s.charAt(j))
    // dp[i][j]= 2+lps(s, i+1, j-1,dp);
    // else
    // dp[i][j]=Math.max(lps(s, i+1, j,dp) ,lps(s, i, j-1,dp));

    // return dp[i][j];

    // public int longestPalindromeSubseq(String s) {
    //     int n = s.length();
    //    int[][] dp = new int[s.length()][s.length()];

    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         dp[i][i] = 1;
    //         for (int j = i + 1; j < s.length(); j++) {
    //             if (s.charAt(i) == s.charAt(j))
    //                 dp[i][j] = 2 + dp[i + 1][j - 1];
    //             else
    //                 dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);

             
    //         }
    //     }
    //     return dp[0][s.length() - 1];


     public int longestPalindromeSubseq(String s) {
        int n  = s.length();
        int pre[] = new int[n];
        int cur[] = new int[n];
        for (int i = s.length() - 1; i >= 0; i--) {
           cur[i]=1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    cur[j] = pre[j - 1] + 2;
                else
                  cur[j] = Math.max(pre[j], cur[j - 1]);
             
            }
            pre = cur.clone();
        }
      return cur[n - 1];
    }
}