class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0; i<9; i++){
            int x[] = new int[9];
            int y[] = new int[9];
            for(int j=0; j<9; j++){
                    if(board[i][j] != '.'){
                        if(x[board[i][j]-'0'-1] == 1) return false;
                        x[board[i][j]-'0'-1] = 1;
                    }
                    if(board[j][i] != '.'){
                        if(y[board[j][i]-'0'-1] == 1) return false;
                        y[board[j][i]-'0'-1] = 1;
                    }
            }
        }

        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                int block[] = new int[9];
                for(int r=i; r<i+3; r++){
                    for(int c=j; c<j+3; c++){
                        if(board[r][c] == '.') continue;
                        if(block[board[r][c] - '0'-1] == 1) return false;
                        block[board[r][c] - '0'-1] = 1;
                    }
                }
            }
        }
        return true;
    }
}
