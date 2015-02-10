package chang.hu.t1;

import java.util.Scanner;

public class Q13 {

	/**
	 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
	 * 
	 * 在循环中，只要除数不等于0，用较大数除以较小的数，将小的
	 * 一个数作为下一轮 循环的大数，取得的余数作为下一轮循环的
	 * 较小的数，如此循环直到较小的数的值为0，返回较大的数，
	 * 此数即为最大公约数，最小公倍数为两数之积除以最大公约数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int a, b, m;
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个整数");
		a = s.nextInt();

		System.out.println("请再输入一个整数");
		b = s.nextInt();
		
		Deff d = new Deff();
		m = d.deff(a, b);
		int n = (a * b) / m;
		
		System.out.println("最大公约数:" + m);
		System.out.println("最小公倍数:" + n);
	}
}

class Deff {
	public int deff(int x, int y) {
		if (x < y) {
			int t = x;
			x = y;
			y = t;
		}
		// x 为较大的数   y 为较小的数
		while (y != 0) {
			if (x == y)
				return x;
			else {
				int k = x % y;
				x = y;
				y = k;
			}
		}
		return x;
	}
}
