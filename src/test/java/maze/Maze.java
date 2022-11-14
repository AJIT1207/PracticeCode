package maze;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {

        //this is after adding new comment line
        //new line had added
      //  path("", 3, 3);  //printing the total path
      //  System.out.println(pathList("", 3,3)); //total path in list
      //  System.out.println(pathlistdigonal("", 3,3));
        boolean board[][] = {
                                {true, true, true},
                                {true, false, true},
                                {true, true, true}
                            };

       // pathRestrictions("",  board, 0, 0);
        System.out.println(pathRestrictionsList("", board, 0,0));


    }

    static void path(String p, int row, int col)
    {
        if(row == 1 && col == 1)
        {
            System.out.println(p);
            return;
        }

        if(row > 1)
        {
            path(p + 'D', row-1, col);
        }

        if(col > 1)
        {
            path(p+'R', row, col-1);
        }


    }

    static ArrayList<String> pathList(String p, int row, int col)
    {
        if(row == 1 && col == 1)
        {
            ArrayList<String> list = new ArrayList<String>();

            list.add(p);

            return list;
        }
        ArrayList<String> list  = new ArrayList<>();
        if(row > 1)
        {
            list.addAll(pathList(p + 'D', row-1, col));
        }

        if(col > 1)
        {
            list.addAll(pathList(p+'R', row, col-1));
        }

    return list;
    }

    //diagonal
    static ArrayList<String> pathlistdigonal(String p, int row, int col)
    {
        if(row == 1 && col == 1)
        {
            ArrayList<String> list = new ArrayList<String>();

            list.add(p);

            return list;
        }
        ArrayList<String> list  = new ArrayList<>();
        if(row > 1)
        {
            list.addAll(pathlistdigonal(p + 'V', row-1, col));
        }

        if(col > 1)
        {
            list.addAll(pathlistdigonal(p+'H', row, col-1));
        }

        if(row >1 && col > 1)
        {
            list.addAll(pathlistdigonal(p+'D', row-1, col-1));
        }

        return list;
    }

    //path restrictions

    static void pathRestrictions(String p, boolean maze[][], int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        if (row < maze.length - 1) {
            pathRestrictions(p + 'D', maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, row, col + 1);
        }

    }

    //path restrictions in list

    static ArrayList<String> pathRestrictionsList(String p, boolean maze[][], int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (!maze[row][col]) {
            return list;
        }

        if (row < maze.length - 1) {
            list.addAll(pathRestrictionsList(p + 'D', maze, row + 1, col));
        }

        if (col < maze[0].length - 1) {
            list.addAll(pathRestrictionsList(p + 'R', maze, row, col + 1));
        }
        return list;
    }
    }
