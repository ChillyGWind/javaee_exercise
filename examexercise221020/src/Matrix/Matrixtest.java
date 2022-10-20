package Matrix;
public class Matrixtest {
    public static void main(String[] args) {
        double[][] a = new double[][]{{1d,2d},{3d,4d}};
        Matrix_Show(a);
        double[][] b = new double[4][4];
        Matrix_value(b);
        Matrix_Show(b);
        Matrix_set(2,3,5,b);
        Matrix_Show(b);
        Matrix_get(2,1,a);
        double[][] c = new double[][]{{2d,1d},{2d,2d}};
        Matrix_Add(a,c);
        Matrix_Mul(a,c);
    }
    public static double[][] Matrix_value(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = 0;
            }
        }
        return a;
    }

    public static void Matrix_set(int a , int b , double c , double[][] d) {
        d[a-1][b-1] = c;
    }

    public static void Matrix_get(int a , int b , double[][] d) throws OutOfBoundException {
        if (a < 0 ||  b < 0 ) {
            throw new OutOfBoundException();
        }
        System.out.print(d[a-1][b-1]);
        System.out.println();
        System.out.println();
    }
    public static void Matrix_Show(double[][] a) {
        // System.out.println(Arrays.deepToString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void Matrix_Add(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        Matrix_Show(result);
    }
    public static void Matrix_Mul(double[][] a, double[][] b) {
        double[][] result = new double[a[0].length][b.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        Matrix_Show(result);
    }
}
