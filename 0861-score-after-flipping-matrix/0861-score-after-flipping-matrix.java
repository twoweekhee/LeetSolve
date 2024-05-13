class Solution {
    
    public int matrixScore(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int checker;
            int sum = 0;
            for (int i = 0; i < m; i++) {
                System.out.println(grid[i][0]);
                if (grid[i][0] == 0) {
                    for (int j = 0; j < n; j++) {
                        if (grid[i][j] == 0) {
                            grid[i][j] = 1;
                        } else {
                            grid[i][j] = 0;
                        }

                    }
                }
            }

            for (int i = 1; i < n; i++) {
                checker = 0;
                for (int j = 0; j < m; j++) {
                    if (grid[j][i] == 0) {
                        checker += 1;
                    }
                }
                if (checker > m / 2) {
                    for (int j = 0; j < m; j++) {
                        if (grid[j][i] == 0) {
                            grid[j][i] = 1;
                        } else {
                            grid[j][i] = 0;
                        }
                    }
                }

            }

            for (int i = 0; i < m; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(grid[i][j]);
                }
                sum += Integer.parseInt(String.valueOf(sb), 2);
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(grid[i][j]);
                }
            }

        return sum;
        }
}