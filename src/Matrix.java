public class Matrix {
    public int rows;
    public int columns;
    public int[][] array;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.array = new int[rows][columns];
    }

    public void addition(Matrix matrix2) {
        if (this.rows != matrix2.rows || this.columns != matrix2.columns) {
            return;
        }

        int[][] sum = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = this.array[i][j] + matrix2.array[i][j];
                System.out.println(sum[i][j]);
            }
        }
    }

    public void multiply(int num) {
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = this.array[i][j] * num;
                System.out.println(result[i][j]);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
