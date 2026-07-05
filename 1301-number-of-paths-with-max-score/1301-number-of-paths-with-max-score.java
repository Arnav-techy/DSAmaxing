class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int MOD = 1_000_000_007;

        int[][] dpScore = new int[n][n];
        int[][] dpPaths = new int[n][n];

        // Base case: Start at the bottom-right 'S'
        dpPaths[n - 1][n - 1] = 1;

        // Direction vectors to look at choices from the current cell: down, right, down-right
        int[][] dirs = {{1, 0}, {0, 1}, {1, 1}};

        // Iterate backwards from the bottom-right corner to the top-left
        for (int r = n - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                // Skip obstacles and the starting cell itself since it's already initialized
                if (board.get(r).charAt(c) == 'X' || (r == n - 1 && c == n - 1)) {
                    continue;
                }

                int maxScore = -1;
                int pathCount = 0;

                // Check the 3 possible predecessors that could transition to (r, c)
                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    // Ensure neighbor is within bounds and reachable
                    if (nr < n && nc < n && dpPaths[nr][nc] > 0) {
                        if (dpScore[nr][nc] > maxScore) {
                            maxScore = dpScore[nr][nc];
                            pathCount = dpPaths[nr][nc];
                        } else if (dpScore[nr][nc] == maxScore) {
                            pathCount = (pathCount + dpPaths[nr][nc]) % MOD;
                        }
                    }
                }

                // If maxScore is still -1, this cell cannot be reached from 'S'
                if (maxScore != -1) {
                    int currentVal = (r == 0 && c == 0) ? 0 : board.get(r).charAt(c) - '0';
                    dpScore[r][c] = maxScore + currentVal;
                    dpPaths[r][c] = pathCount;
                }
            }
        }

        return new int[]{dpScore[0][0], dpPaths[0][0]};
    }
}