public class App {

    public static int isSolved(int[][] board) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0]; 
            }
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i]; 
            }
        }
        if (board[1][1] != 0) {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                return board[1][1]; 
            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                return board[1][1];
            }
        }
        boolean finished = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    finished = false;
                }
            }
        }
        if (finished) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(isSolved(new int[][] {{0,0,1},{0,1,2},{2,1,0}}));
        System.out.println(isSolved(new int[][] {{1,1,1},{0,2,2},{0,0,0}}));    
        System.out.println(isSolved(new int[][] {{1,1,2},{0,2,0},{2,1,1}}));
        System.out.println(isSolved(new int[][] {{1,2,1},{1,1,2},{2,1,2}}));
    }
}
