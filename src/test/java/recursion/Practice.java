package recursion;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int matrix[][] = {{3, 7, 8},
                {9, 11, 13}, {15, 16, 17}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> row = new ArrayList<Integer>();
        List<Integer> col = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(matrix[i][j], min);
            }
            row.add(min);
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                max = Math.max(matrix[i][j], max);
            }

            col.add(max);
        }

        row.retainAll(col);
        return row;
    }
}