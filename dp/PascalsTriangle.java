import java.util.*;

class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {

        var list = new ArrayList<List<Integer>>();
        list.add(new ArrayList<>());
        list.get(0).add(1);

        for (int rows = 1; rows < numRows; rows++) {
            var row = new ArrayList<Integer>();
            row.add(1);
            for (int i = 1; i < rows; i++) {
                int nLeft = list.get(rows-1).get(i-1);
                int nRight = list.get(rows-1).get(i);
                row.add(nLeft + nRight);
            }
            row.add(1);
            list.add(row);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println("Rows: " + generate(5));
    }
}