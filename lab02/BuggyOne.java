package lab02;

public class BuggyOne {

    /**
     * Sums up the columns of a 2D array of doubles.
     *
     * @param mat 2D array of doubles
     * @return 1D array of doubles storing column sums
     */
    public static double[] sumCols(double[][] mat) {
        double[] colsums = new double[mat.length];
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                colsums[0] += mat[i][j];
            }
        }
        return colsums;
    }

    public static void main(String[] args) {
        /*
        First test case is 3 x 3 matrix
        1 1 1
        2 2 2
        3 4 5

        Column sums should be 6 7 8.
         */
        int m = 3;
        int n = 3;
        double[][] mat1 = {{1,1,1}, {2,2,2}, {3,4,5}};
        double[] colsums = sumCols(mat1);
        for (int i=0; i<n; i++) {
            System.out.println("Sum of column " + i + " = " + colsums[i]);
        }
    }
}
