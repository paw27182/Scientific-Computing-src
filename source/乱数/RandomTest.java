package 乱数;


public class RandomTest {
	public static void main(String[] args) {

		int[] a = new int[5];
		
		for (int i = 0; i < 100000; i++) {
			int r = new java.util.Random().nextInt(5);

			switch (r) {
			case 0:
				a[0]++;
				break;
			case 1:
				a[1]++;
				break;
			case 2:
				a[2]++;
				break;
			case 3:
				a[3]++;
				break;
			case 4:
				a[4]++;
				break;
			default:
				;
			} // switch
		} // for
		
		System.out.printf("%5d\t%5d\t%5d\t%5d\t%5d\t", a[0]/a[0], a[1]/a[0], a[2]/a[0], a[3]/a[0], a[4]/a[0]);

	}
}
