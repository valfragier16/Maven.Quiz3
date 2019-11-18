package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board = new String[2][2];

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];

        for (int i = 0; i < 3; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] currentRow = getRow(rowIndex);

        if (currentRow[0].equals(currentRow[1]) && currentRow[0].equals(currentRow[2])) {
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] currentColumn= getColumn(columnIndex);

        if (currentColumn[0].equals(currentColumn[1]) && currentColumn[0].equals(currentColumn[2])) {
            return true;
        }
        return false;
    }
    public Boolean isDiagonalHomogeneous() {
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
            return true;
        }
        else return board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]);

    }

    public String getWinner() {
        String result = "";

        if (isDiagonalHomogeneous()) {
            result = board[1][1];
        } else {
            for (int i = 0; i < 3; i++) {
                if (isRowHomogenous(i)) {
                    result = board[i][i];
                } else if (isColumnHomogeneous(i)) {
                    result = board[i][i];
                }
            }
        }
        return result;
    }

    public String[][] getBoard() {
        return this.board;
    }

}
