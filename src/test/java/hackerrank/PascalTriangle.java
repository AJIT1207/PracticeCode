package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        int numRows = 5;

        System.out.println(generate(numRows));
    }

    public static List<List> generate(int numRows)
    {
        List<List> allrows = new ArrayList<List>();
        ArrayList row = new ArrayList();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
          //      row.set(j, (row.get(j) + row.get(j+1)));
            allrows.add(new ArrayList(row));
        }
        return allrows;

    }

}
