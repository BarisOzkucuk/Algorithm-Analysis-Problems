import java.util.Arrays;

public class MatrixDownsampler {

    public static int[][] downsampleMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int newRows = rows / 2;
        int newCols = cols / 2;

        int[][] newMatrix = new int[newRows][newCols];

        for (int i = 0; i < rows; i += 2) {
            for (int j = 0; j < cols; j += 2) {
                
                int sum = matrix[i][j]       
                        + matrix[i][j+1]     
                        + matrix[i+1][j]     
                        + matrix[i+1][j+1];  

                int average = sum / 4;

                newMatrix[i / 2][j / 2] = average;
            }
        }

        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] inputMatrix = {
            {1, 5, 8, 0},
            {4, 6, 6, 6},
            {2, 2, 5, 5},
            {8, 0, 4, 1}
        };

        System.out.println("Orijinal Matris:");
        printMatrix(inputMatrix);

        int[][] result = downsampleMatrix(inputMatrix);

        System.out.println("\nKüçültülmüş Matris (Ortalama):");
        printMatrix(result);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
