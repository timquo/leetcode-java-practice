import java.util.ArrayList;
import java.util.List;

public class Problem0118 {
    public static void main(String[] args) {
        /*
            Given an integer numRows, return the first numRows of Pascal's triangle.
            Input: numRows = 5
            Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        */
        System.out.println("For the given input solution is: " + generateTriangle(6));
    }

    public static List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last element of each row is always 1
                } else {
                    int sum = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(sum);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}
