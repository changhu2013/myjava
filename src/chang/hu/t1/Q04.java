package chang.hu.t1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {

		int[] arr = new int[3];
		Scanner s = new Scanner(System.in);
		arr[0] = s.nextInt();
		arr[1] = s.nextInt();
		arr[2] = s.nextInt();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Object[] a2 = new Object[3];
		a2[0] = 100;
		a2[1] = 23;
		a2[2] = 33;
		Arrays.sort(a2, new Comparator() {
			public int compare(Object o1, Object o2) {
				System.out.println(o1 + " " + o2);
				Integer a = (Integer) o1;
				Integer b = (Integer) o2;
				return a - b;
			}
		});
		System.out.println(Arrays.toString(a2));
	}
}
