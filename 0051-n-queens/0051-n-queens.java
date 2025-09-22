class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        placeQueens(board, 0, result);
        return result;
    }

    private void placeQueens(boolean[][] board, int row, List<List<String>> result) {
        if (row == board.length) {
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                placeQueens(board, row + 1, result);
                board[row][col] = false;
            }
        }
    }

    private boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) return false;
        }

        return true;
    }

    private List<String> constructBoard(boolean[][] board) {
        List<String> boardRepresentation = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? 'Q' : '.');
            }
            boardRepresentation.add(sb.toString());
        }
        return boardRepresentation;
    }
}