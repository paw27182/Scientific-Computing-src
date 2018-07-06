package 行列;
/*
 * Commons Math: The Apache Commons Mathematics Library
 */

import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/* 線形代数の行列演算 */
public class 固有値 {
	public static void main(String[] args) throws Exception {

		// 行列式、固有値と固有ベクトル
		System.out.println("\n**** 行列式、固有値と固有ベクトル");
		// RealMatrix matrix4A = MatrixUtils.createRealMatrix(new double[][] {
		// { 3, 2 }, { 2, 3 } });

		RealMatrix matrix4A = MatrixUtils.createRealMatrix(new double[][] { { 4, 3 }, { -2, -1 } });

		EigenDecomposition ed = new EigenDecomposition(matrix4A);
		System.out.println("行列式: " + (float) ed.getDeterminant());
		double[] eigens = ed.getRealEigenvalues();
		for (int i = 0; i < eigens.length; i++) {
			System.out.println("固有値: " + (float) eigens[i]);
			System.out.println("固有ベクトル: " + ed.getEigenvector(i));
		}
	}
}
