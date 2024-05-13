public class N_Queens
{
    public static void printBoard(char board[][])
    {
        System.out.println("---------------------------------");
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }
    public static boolean isSafe(char [][] board, int row, int col)
    {
        //verticlally up direction

        for(int i = row-1; i >= 0; i--)
        {
            if(board[i][col] == 'Q')
                return false;
        }

        //diagonally left up

        for(int i = row-1, j = col-1; i >= 0 && j>= 0; i--, j--)
        {
            if(board[i][j] == 'Q')
                return false;
        }

        //diagonally right up

        for(int i = row-1, j = col+1; i >= 0 && j<board.length; i--, j++)
        {
            if(board[i][j] == 'Q')
                return false;
        }

        return true;
    }
    public static void nQueens(char [][] board, int row)
    {
        //BASE CASE
        if(row == board.length)
        {
            printBoard(board);
            count++;
            return;
        }

        for(int j = 0; j<board.length; j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j] = 'Q';
                nQueens(board, row+1);//Recursion
                board[row][j] = 'X';//Back Track
            }
        }
    }
    static int count = 0;
    public static void main(String args[])
    {
        int n = 4;
        char board [][] = new char[n][n];
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
                board[i][j] = 'X';
        }
        nQueens(board,0);
        System.out.println("Total ways are : "+count);
    }
}
