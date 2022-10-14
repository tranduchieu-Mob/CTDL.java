import java.util.HashSet;
class _36 {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String a = 'r' + "-" + i + "-" + board[i][j];
                    String b = 'c' + "-" + j + "-" + board[i][j];
                    String c = (i / 3) + "-" + board[i][j] + "-" + (j / 3);
                    if (!hs.add(a) || !hs.add(b) || !hs.add(c))
                        return false;

                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char [][] board = {{'5','3','.','.','7','.','.','.','.'}
                          ,{'6','.','.','1','9','5','.','.','.'}
                          ,{'.','9','8','.','.','.','.','6','.'}
                          ,{'8','.','.','.','6','.','.','.','3'}
                          ,{'4','.','.','8','.','3','.','.','1'}
                          ,{'7','.','.','.','2','.','.','.','6'}
                          ,{'.','6','.','.','.','.','2','8','.'}
                          ,{'.','.','.','4','1','9','.','.','5'}
                          ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }
}