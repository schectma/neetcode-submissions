class Solution {
    public static HashMap<Character, Integer> freshMap(){
        HashMap<Character, Integer> tally = new HashMap<>();
        return tally;
    }

    public char cell_val;

    public boolean checkCell(char cell, HashMap<Character, Integer> tally){
        if (cell >= '1' && cell <= '9') {
            if (tally.containsKey(cell)){
                return false;
            } else if (cell < '1' || cell > '9'){

            } else {
                tally.put(cell, 1);
            }
        }
        return true;
    }

    public boolean checkRow(char[][] board, int row){
        System.out.println("Checking row " + row);
        // Col varies to move search horizontally across board. Row constant.
        HashMap<Character, Integer> tally = freshMap();
        for(int col = 0; col < board[row].length; col++){
            cell_val = board[row][col];
            if(!checkCell(cell_val, tally)){
                return false;
            }
        }
        System.out.println("Row " + row + " cleared");
        return true;
    }

    public boolean checkCol(char[][] board, int col){
        // Row varies to move search vertically down board. Col constant.
        HashMap<Character, Integer> tally = freshMap();
        for (int row = 0; row < board.length; row++){
            cell_val = board[row][col];
            if(!checkCell(cell_val, tally)){
                return false;
            }
        }
        return true;
    }

    public boolean checkSubBox(char[][] board, int local_y, int local_x){
        HashMap<Character, Integer> tally = freshMap();
        for(int y = local_y; y < local_y + 3; y++){
            for(int x = local_x; x < local_x + 3; x++){
                cell_val = board[y][x];
                if(!checkCell(cell_val, tally)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        /*  Check rows, then columns, then sub-boxes.
        *   Keep a tally map for each.
        */
        // Iterate through row indices
        for(int row = 0; row < board.length; row++){
            if(!checkRow(board, row)){
                return false;
            }
        }

        // Iterate through col indices
        for(int col = 0; col < board[0].length; col++){
            if(!checkCol(board, col)){
                return false;
            }
        }

        // Iterate through sub-box start indices
        for (int local_y = 0; local_y <= board.length-3; local_y += 3){
            for(int local_x = 0; local_x <= board.length-3; local_x += 3)
                if(!checkSubBox(board, local_y, local_x)){
                    return false;
                }
        }

        return true;
    }
}
