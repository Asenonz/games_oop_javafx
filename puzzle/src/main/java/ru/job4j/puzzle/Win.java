package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == '1' && (winHorizontal(board, i) || winVertical(board, i))) {
                rsl = true;
            }
        }
        return rsl;
    }
    public static boolean winVertical(int[][] board, int column) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if ('1' != board[cell][column]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean winHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if ('1' != board[row][cell]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
