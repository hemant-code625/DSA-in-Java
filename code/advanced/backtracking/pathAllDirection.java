package advanced.backtracking;

import java.util.ArrayList;

public class pathAllDirection {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        pathInAll("", board, 0, 0);

    }


    static void pathInAll(String p, boolean[][] maze, int r, int c) {

        if(r== maze.length-1 && c == maze[0].length-1){                   // Target position in the matrix
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {                        // if this cell in boolean matrix (maze[r][c]) == false then return
            return;
        }

        //I am considering this block in my path
        maze[r][c] = false;                   // this check is for the cell that we have travelled

        if (r > 0) {
            pathInAll(p + "U", maze, r - 1, c);
        }
        if (c < maze[0].length - 1) {
            pathInAll(p + "R", maze, r, c + 1);
        }

        if (c > 0) {
            pathInAll(p + "L", maze, r, c-1);
        }
        if (r < maze.length - 1) {
            pathInAll(p + "D", maze, r + 1, c);

            //this line is where function is over
            // so before the function is removed, also remove the changes that were made by that function
            maze[r][c] = true;


        }
    }
}
