class Solution {
    int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()][text2.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return getSubsequence(text1, text2, text1.length() - 1, text2.length() - 1);
    }

    public int getSubsequence(String t1, String t2, int idx1, int idx2) {
        if (idx1 < 0 || idx2 < 0) {
            return 0;

        }
        if (dp[idx1][idx2] != -1)
            return dp[idx1][idx2];
        if (t1.charAt(idx1) == t2.charAt(idx2)) {
            return dp[idx1][idx2] = 1 + getSubsequence(t1, t2, idx1 - 1, idx2 - 1);
        } else {
            return dp[idx1][idx2] = 0
                    + Math.max(getSubsequence(t1, t2, idx1, idx2 - 1), getSubsequence(t1, t2, idx1 - 1, idx2));
        }

    }
}