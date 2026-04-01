class Solution {
    int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    int[][] dp;

    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        dp = new int[m][n];
        int max = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                max = Math.max(max, dfs(matrix, i, j));
            }
        }

        return max;
    }

    private int dfs(int[][] matrix, int i, int j) {
        if(dp[i][j] != 0) return dp[i][j];

        int maxLen = 1; // at least the cell itself

        for(int[] dir : directions) {
            int ni = i + dir[0];
            int nj = j + dir[1];

            if(ni >= 0 && nj >= 0 && ni < matrix.length && nj < matrix[0].length
               && matrix[ni][nj] > matrix[i][j]) {

                maxLen = Math.max(maxLen, 1 + dfs(matrix, ni, nj));
            }
        }

        dp[i][j] = maxLen;
        return maxLen;
    }
}