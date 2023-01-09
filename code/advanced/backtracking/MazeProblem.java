package advanced.backtracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(pathCount(3,3));
//        System.out.println(pathRet("",3,3));                //pathRet => Return type function
//        System.out.println(pathRetDiagonal("",3,3));

        boolean[][] board = {  {true,true,true},
                               {true,false,true},
                               {true,true,true},
            };

        pathWithObstacle("",board,0,0);


    }
    static int pathCount(int r, int c){
        if(r==1 || c ==1){
            return 1;
        }
        int left = pathCount(r-1,c);
        int right = pathCount(r,c-1);
        return left+right;
    }

    static ArrayList pathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList <Integer> list = new ArrayList<>();
        if (r>1){
            list.addAll(pathRet(p+"D",r-1,c));
        }

        if(c>1){
            list.addAll(pathRet(p+"R",r,c-1));

        } return list;

    }

    // adding diagonal path into the maze
    static ArrayList pathRetDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String>list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list= new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(pathRetDiagonal(p+"D", r-1,c-1));
        }

        if(r>1){
            list.addAll(pathRetDiagonal(p+"H",r-1,c));
        }
        if(c>1){
                list.addAll(pathRetDiagonal(p+"V", r, c-1));

        }
        return list;
    }
    static void pathWithObstacle(String p , boolean [][]maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            pathWithObstacle(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathWithObstacle(p+'R',maze,r,c+1);
        }

    }

}