package 三角関数;

/*
 * y = sin(x)
 */

import java.lang.Math;

public class Sine {
	public static void main(String[] args) {
		
		double y;
		double x;

		for (int i = 0; i <= 90; i++) {
			x = Math.toRadians((double) i);
			y = Math.sin(x);
//			System.out.println("sin(" + i + ")= " + y);
			System.out.printf("sin(" + i + ")= %f\n", y); 
		}
	}
}
