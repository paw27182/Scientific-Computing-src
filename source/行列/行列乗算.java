package 行列;

/*
 * 行列の乗算
 */

public class 行列乗算 {

	/* Matrix Printing */
	static void printMatrix(double[][] X) {
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X[0].length; j++) {
				System.out.print(X[i][j] + "  ");
			}
			System.out.println("");
		}
	}

	/* Matrix Dot Product */
	static double[][] dotMatrix(double[][] X, double[][] Y) {
		double[][] Z = new double[3][3];
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < Y[0].length; j++) {
				Z[i][j] = 0.0;
				for (int k = 0; k < X[0].length; k++) {
					Z[i][j] = Z[i][j] + X[i][k] * Y[k][j];
				}
			}
		}
		return Z;
	}

	/* MAIN */
	public static void main(String[] args) {
		double[][] A;
		double[][] B;

		A = new double[][] { { 3, 1, 4 },
                             { 2, 1, 2 },
                             { 2, 3, 5 } };
		B = new double[][] { { 1, 0, 0 },
			                 { 0, 1, 0 },
			                 { 0, 0, 1 } };

		System.out.println("Matrix A");
		printMatrix(A);

		System.out.println("\nMatrix B");
		printMatrix(B);

		System.out.println("\nMatrix A*B");
		printMatrix(dotMatrix(A, B));
	}
}
