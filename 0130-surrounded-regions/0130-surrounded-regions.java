class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // 1. Check first and last row for 'O'
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {        // ✅ Fixed: 'O' not '0'
                dfs(board, 0, j);
            }
            if (board[m - 1][j] == 'O') {    // ✅ Fixed: 'O' not '0'
                dfs(board, m - 1, j);
            }
        }

        // 2. Check first and last column for 'O'
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {        // ✅ Fixed: 'O' not '0'
                dfs(board, i, 0);
            }
            if (board[i][n - 1] == 'O') {    // ✅ Fixed: 'O' not '0'
                dfs(board, i, n - 1);
            }
        }

        // 3. Flip 'O' to 'X', restore 'S' to 'O'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {    // ✅ Fixed: 'O' not '0'
                    board[i][j] = 'X';       // Surrounded → Flip
                } else if (board[i][j] == 'S') {
                    board[i][j] = 'O';       // ✅ Fixed: 'O' not '0'
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;

        // Check boundaries
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }

        // Check if current cell is 'O'
        if (board[i][j] != 'O') {    // ✅ Fixed: 'O' not '0'
            return;
        }

        // Mark as safe
        board[i][j] = 'S';

        // Explore 4 directions
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}