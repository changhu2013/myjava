package chang.hu.t1;

import java.util.Scanner;

public class Q13 {

	/**
	 * ��Ŀ����������������m��n���������Լ������С��������
	 * 
	 * ��ѭ���У�ֻҪ����������0���ýϴ������Խ�С��������С��
	 * һ������Ϊ��һ�� ѭ���Ĵ�����ȡ�õ�������Ϊ��һ��ѭ����
	 * ��С���������ѭ��ֱ����С������ֵΪ0�����ؽϴ������
	 * ������Ϊ���Լ������С������Ϊ����֮���������Լ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int a, b, m;
		Scanner s = new Scanner(System.in);
		System.out.println("������һ������");
		a = s.nextInt();

		System.out.println("��������һ������");
		b = s.nextInt();
		
		Deff d = new Deff();
		m = d.deff(a, b);
		int n = (a * b) / m;
		
		System.out.println("���Լ��:" + m);
		System.out.println("��С������:" + n);
	}
}

class Deff {
	public int deff(int x, int y) {
		if (x < y) {
			int t = x;
			x = y;
			y = t;
		}
		// x Ϊ�ϴ����   y Ϊ��С����
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
