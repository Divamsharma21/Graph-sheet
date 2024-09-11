// class Solution {

//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {

//         if (obstacleGrid[0][0] == 1)
//             return 0;
//         return solveRec(obstacleGrid, 0, 0);
//     }

//     private int solveRec(int[][] obstacleGrid, int row, int col) {
//         // base condition
//         if (row >= obstacleGrid.length || col >= obstacleGrid[0].length)
//             return 0;

//         if (row == obstacleGrid.length - 1 && col == obstacleGrid[0].length - 1)
//             return obstacleGrid[row][col] == 0 ? 1 : 0;

//         // obstacle is in the row, col grid the return 0
//         if (obstacleGrid[row][col] == 1)
//             return 0;

//         // go right
//         int right = solveRec(obstacleGrid, row, col + 1);
//         // go down
//         int down = solveRec(obstacleGrid, row + 1, col);

//         return right + down;
//     }
// }


class Solution {
    // method 3. bottom up approach(tabulation) + space optimization time O(M*N) space O(1)
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        // if grid is start or end with obstacle then return 0
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
            return 0;
        
        // fill the grid's bottom row and most right columns with 1 if no obstacle
        int obs = 1;
        for(int i = m - 1; i >= 0; i--){
            if(obstacleGrid[i][n - 1] == 1)
                obs = 0;
            obstacleGrid[i][n- 1] = obs;
        }
        obstacleGrid[m-1][n-1] = 0;
        obs = 1;
        for (int j = n - 1; j >= 0; j--){
            if(obstacleGrid[m - 1][j] == 1)
                obs = 0;
            obstacleGrid[m - 1][j] = obs;
        }
        // iterative fill the all value from m - 2, n - 2 back to up 
        for(int i = m - 2; i >= 0; i--){
            for(int j = n - 2; j >= 0; j--){
                // if the grid has obstacle then mark as 0 path
                if(obstacleGrid[i][j] == 1)
                    obstacleGrid[i][j] = 0;
                // else add the total path from bottom and right grid
                else
                    obstacleGrid[i][j] = obstacleGrid[i + 1][j] + obstacleGrid[i][j + 1];
            }
                
        }
        return obstacleGrid[0][0];
    }

}