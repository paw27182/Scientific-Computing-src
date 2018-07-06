package 行列;
/*
 * JAMA is a basic linear algebra package for Java.
 */

import Jama.Matrix;

public class 行列式 {

	/* Matrix Printing */
	static void printMatrix(Matrix X) {
		for (int i = 0; i < X.getRowDimension(); i++) {
			for (int j = 0; j < X.getColumnDimension(); j++) {
				System.out.printf("%7.3f", (double) X.get(i, j));
				System.out.print(", \t");
			}
			System.out.println("");
		}
	}
	
	/* main */
	public static void main(String[] args) {

		double[][] array = { { 3, 1, 4 },
				             { 2, 1, 2 },
				             { 2, 3, 5 } };
		Matrix A = new Matrix(array);
		Matrix B = new Matrix(new double[][] { { 1, 0, 0 },
			                                   { 0, 1, 0 },
			                                   { 0, 0, 1 } });
		// A, Bの印刷
		System.out.println("A=");
		printMatrix(A);
		System.out.println("B=");
		printMatrix(B);
		
		// 乗算
		System.out.println("X = A * B");
		Matrix X = A.times(B);
		printMatrix(X);

		// 行列式
		System.out.println("Aの行列式=" + A.det());
		System.out.println("Bの行列式=" + B.det());
		System.out.println("Xの行列式=" + X.det());

		// 逆行列
		System.out.println("Y = Aの逆行列");
		Matrix Y = A.inverse();
		printMatrix(Y);
		
		System.out.println("Z = A * Y");
		Matrix Z = A.times(Y);
		printMatrix(Z);
		
	}
}
