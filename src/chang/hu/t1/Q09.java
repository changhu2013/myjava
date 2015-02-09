package chang.hu.t1;

public class Q09 {

	public static void main(String[] args) {
		int p = 1;
		int c = 2;
		double count = 0;
		for (int i = 0; i < 20; i++) {
			count += (double)c / p;
			int t = c;
			c = c + p;
			p = t;
		}
		System.out.println("count:" + count);
	}
}
