package githubcopilot;

public class SudokuSolver {
    int[][] board;
    SudokuSolver() {   
    }
    SudokuSolver(int[][] board) {
        this.board = board;
    }
    
    //solve the sudoku
    public void solve(int row, int col) {
        //solve the sudoku
        if (row == 9) {
            return;
        }
        if (board[row][col] != 0) {
            solve(row + 1, col);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isValid(row, col, i)) {
                    board[row][col] = i;
                    solve(row + 1, col);
                    board[row][col] = 0;
                }
            }
        }


    }


    
    //check if the board is valid
    public boolean isValid(int row, int col, int num) {
        //check if the board is valid
        if (checkBox(row, col, num) && checkRow(row, num) && checkColumn(col, num)) {
            return true;
        } else {
            return false;
        }
    }

    //check row
    public boolean checkRow(int row, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        return true;
    }

    //check column
    public boolean checkColumn(int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        return true;
    }

    //check box
    public boolean checkBox(int row, int col, int num) {
        int boxRow = row - row % 3;
        int boxCol = col - col % 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;

    }
}
