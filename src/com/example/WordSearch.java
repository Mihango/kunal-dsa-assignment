package com.example;

public class WordSearch {

    public static void main(String[] args) {
//        char[][] board = {
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}};
//        String word = "ABCCED";

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";

        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        return helper(board, visited, 0, 0, word);
    }

    private static boolean helper(char[][] board, boolean[][] visited, int row, int col, String word) {
        // check if row or col is out of bounds of board
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col]) return false;
        if (word.length() == 0) return true;

        boolean validChar = board[row][col] == word.charAt(0);
        visited[row][col] = true;

        // check up
        String s = validChar ? word.substring(1) : word;
        boolean found = helper(board, visited, row - 1, col, s) || helper(board, visited, row + 1, col, s)
                || helper(board, visited, row, col - 1, s) || helper(board, visited, row, col + 1, s);

        visited[row][col] = false;
        return found;
    }

    private static boolean isAllowed(boolean[][] visited, int row, int col) {
        return !visited[row][col];
    }
}
