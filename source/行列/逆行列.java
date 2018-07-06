package 行列;
/*
 * Commons Math: The Apache Commons Mathematics Library
 */

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class 逆行列 {
	public static void main(String[] args) {

		double[][] m1 = { { 1d, 2d }, { 4d, 5d }, };
		double[][] m2 = { { 2d, 3d }, { 5d, 7d }, };
		double[][] m3 = { { 3d }, { 6d }, };

		// MatrixUtilsでdouble[][]から実行列を作成
		RealMatrix mA = MatrixUtils.createRealMatrix(m1);
		// Arrays2DRowRealMatrixでも作れる
		RealMatrix mB = new Array2DRowRealMatrix(m2);

		System.out.println("A= ");
		printMatrix(mA);
		System.out.println("\nB= ");
		printMatrix(mB);

		// 掛け算
		// 2x2行列同士の掛け算
		System.out.println("\nA×B= ");
		RealMatrix mAxB = mA.multiply(mB);
		printMatrix(mAxB);

		// 2x2行列と2x1行列の掛け算（基本は変わらない）
		System.out.println("\nA×V= ");
		RealMatrix mAxV = mA.multiply(MatrixUtils.createRealMatrix(m3));

		printMatrix(mAxV);

		// 逆行列はinverseを使う
		// 昔のバージョンだと、RealMatrixにinverse()があったようだ。そっちのほうが感覚的にわかりやすいのに。
		System.out.println("\nAの逆行列");
		RealMatrix mAi = new LUDecomposition(mA).getSolver().getInverse();

		printMatrix(mAi);
	}

	/**
	 * 行列の表示
	 * 
	 * @param m
	 */
	private static void printMatrix(RealMatrix m) {
		System.out.println("----------------");
		for (int i = 0; i < m.getRowDimension(); i++) {
			System.out.print("{");
			for (int j = 0; j < m.getColumnDimension(); j++) {
				System.out.printf(m.getEntry(i, j) + ", ");
			}
			System.out.println("}");
		}
	}
}
