public class Rat_in_Maze
{
    
    public static void checkPath(int maze[][], int i, int j)
    {
        int n = maze.length;
        int sol [][] = new int[n][n];
        if(checkpathUtil(maze, sol, i, j, n))
        {
            System.out.println("Solution Exist");
            printPath(sol);
        }
        else
            System.out.println("Solution does not exits");
    }
    public static boolean checkpathUtil(int maze[][], int sol[][], int i, int j, int n)
    {
        if(i == n-1 && j == n-1 && maze[i][j] == 1)
        {
            sol[i][j] = 1;
            return true;
        }
        if(isSafe(maze, i, j))
        {
            if(sol[i][j] == 1)
                return false;
            sol[i][j] = 1;//Pre-Recursion Step
            if(checkpathUtil(maze, sol, i+1, j, n))//DOWN
                return true;
            if(checkpathUtil(maze, sol, i, j+1, n))//RIGHT
                return true;
            if(checkpathUtil(maze, sol, i-1, j, n))//UP
                return true;
            if(checkpathUtil(maze, sol, i, j-1, n))//LEFT
                return true;
            sol[i][j] = 0;//BACKTRACKING STEP
        }
        return false;
    }
    public static boolean isSafe(int maze[][], int i, int j)
    {
        if(i >=0 && j >=0 && i < maze.length && j < maze.length && maze[i][j] == 1)
            return true;
        else
            return false;

    }
    public static void printPath(int sol[][])
    {
        for(int i=0; i<sol.length; i++)
        {
            for(int j=0; j<sol.length; j++)
                System.out.print(sol[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int maze[][] = {{1,1,1,0},{0,1,1,1},{0,0,1,1},{0,0,1,1}};
        int sol[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        checkPath(maze, 0, 0);
    }
}
