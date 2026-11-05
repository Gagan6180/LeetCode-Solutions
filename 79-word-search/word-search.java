class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (backtrack(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;

    }
    public boolean backtrack(char [][] board,String word,int r,int c,int index){
        //base case
        if (word.length() == index){
            return true;
        }
        //checks out of bound conditions
        if (r < 0 || c < 0 || board.length <= r || board[0].length <=c || board[r][c] != word.charAt(index)){
            return false;
        }
        // mark as visited
        char tem = board[r][c];
        board[r][c] = '#';

        // implement 4 conditions
        boolean found = backtrack(board,word,r+1,c,index+1) || backtrack(board,word,r,c+1,index+1) || backtrack(board,word,r,c-1,index+1) || backtrack(board,word,r-1,c,index+1);
        board[r][c] = tem;
        return found;
    }
}