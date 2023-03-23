public class DynamicProgram {
    int fibBrute(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibBrute(n - 1) + fibBrute(n - 2);
        }
    }

    int fibMemo(int n, int[] memo) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] == 0) {
            memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        }
        return memo[n];
    }

    int countPaths(boolean[][] grid, int row, int col) {
        /*if (!validSquare(grid, row, col)) return 0;
        if (isAtEnd(grid, row, col)) return 1;*/
        return countPaths(grid, row+1, col) + countPaths(grid, row, col+1);
    }

    int countPaths(boolean[][] grid, int row, int col, int[][] paths) {
        /*if (!validSquare(grid, row, col)) return 0;
        if (isAtEnd(grid, row, col)) return 1;*/
        if (paths[row][col] == 0) {
            paths[row][col] = countPaths(grid, row+1, col) + countPaths(grid, row, col+1);
        }
        return paths[row][col];
    }
}
