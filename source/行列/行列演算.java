package 行列;
/*
 * Commons Math: The Apache Commons Mathematics Library
 */

import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/* 線形代数の行列演算 */
public class 行列演算 {
	public static void main(String[] args) throws Exception {

		// 行列の定義
		System.out.println("**** 行列の定義");
		RealMatrix matrix1 = MatrixUtils.createRealMatrix(new double[][] { { 1, 0, -4 }, { 2, -3, -1 } });
		System.out.println("行列A: " + matrix1);
		System.out.println("Aの転置行列: " + matrix1.transpose());
		RealMatrix zeroMatrix = MatrixUtils.createRealMatrix(2, 2);
		System.out.println("ゼロ行列: " + zeroMatrix);
		RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
		System.out.println("単位行列: " + identityMatrix);

		// 行列の和とスカラー倍
		System.out.println("\n**** 行列の和とスカラー倍");
		RealMatrix matrixA = MatrixUtils.createRealMatrix(new double[][] { { 1, 0, -4 }, { 2, -3, -1 } });
		RealMatrix matrixB = MatrixUtils.createRealMatrix(new double[][] { { -3, 4, 8 }, { 1, 5, -2 } });
		System.out.println("行列A: " + matrixA);
		System.out.println("行列B: " + matrixB);
		System.out.println("A+B: " + matrixA.add(matrixB));
		System.out.println("A-B: " + matrixA.subtract(matrixB));
		System.out.println("3A: " + matrixA.scalarMultiply(3));
		System.out.println("A-2B: " + matrixA.subtract(matrixB.scalarMultiply(2)));

		// 行列の積
		System.out.println("\n**** 行列の積");
		RealMatrix matrix2A = MatrixUtils.createRealMatrix(new double[][] { { 3, -3, 1 }, { 0, -2, 4 } });
		RealMatrix matrix2B = MatrixUtils.createRealMatrix(new double[][] { { -1, 0 }, { 5, 1 }, { 0, -3 } });
		System.out.println("行列A: " + matrix2A);
		System.out.println("行列B: " + matrix2B);
		System.out.println("AB: " + matrix2A.multiply(matrix2B));

		// 逆行列
		System.out.println("\n**** 逆行列");
		RealMatrix matrix3A = MatrixUtils.createRealMatrix(new double[][] { { 1, 2 }, { 3, 4 } });
		System.out.println("行列A(正則行列): " + matrix3A);
		System.out.println("Aの逆行列: " + MatrixUtils.blockInverse(matrix3A, 0));
		RealMatrix matrix3B = MatrixUtils.createRealMatrix(new double[][] { { 4, 2 }, { 6, 3 } });
		 System.out.println("行列B(正則行列ではない): " + matrix3B);
		// System.out.println("Bの逆行列: " + MatrixUtils.blockInverse(matrix3B, 0));

		// 行列式、固有値と固有ベクトル
		System.out.println("\n**** 行列式、固有値と固有ベクトル");
		RealMatrix matrix4A = MatrixUtils.createRealMatrix(new double[][] { { 1, -2 }, { 3, -4 } });
		EigenDecomposition ed = new EigenDecomposition(matrix4A);
		System.out.println("行列式: " + ed.getDeterminant());
		double[] eigens = ed.getRealEigenvalues();
		for (int i = 0; i < eigens.length; i++) {
			System.out.println("固有値: " + eigens[i]);
			System.out.println("固有ベクトル: " + ed.getEigenvector(i));
		}
	}
}
