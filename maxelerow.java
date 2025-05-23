public class maxelerow {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 9},
                {3, 7, 2},
                {8, 6, 4}
        };
        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Max element in row " + (i + 1) + " is: " + max);
        }
    }
}
