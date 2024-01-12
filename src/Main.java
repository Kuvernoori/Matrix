public class Main {
    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 3);




        System.out.println("Matrix Addition: ");
        matrix1.addition(matrix2);
        matrix1.printMatrix();


        System.out.println("\nMultipl: ");
        matrix1.multiply(2);
        matrix1.printMatrix();
        System.out.printf("\nprintot: ");
        matrix1.printMatrix();

    }
}
