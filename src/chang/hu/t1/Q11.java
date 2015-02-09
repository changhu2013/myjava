package chang.hu.t1;

public class Q11 {

	/**
	 * 题目：判断101-200之间有多少个素数，并输出所有素数。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i <= 200; i++) {
			boolean b = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			if (b) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("素数个数为:" + count);
	}
}
