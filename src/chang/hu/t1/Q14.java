package chang.hu.t1;

import java.util.Scanner;

public class Q14 {

	/**
	 * ��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ��
	 * ����a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)��
	 * ����������м��̿��ơ�
	 * @param args
	 */
	public static void main(String[] args){
		
		int a, b, sum = 0;
	
		Scanner s = new Scanner(System.in);
		System.out.println("������aֵ:");
		a = s.nextInt();		
		
		System.out.println("������b����:");
		b = s.nextInt();
		
		int n = a;
		for(int i = 0; i < b; i++){
			sum += n;
			n = n * 10 + a;
		}
		System.out.println("�ϼ�Ϊ:" + sum);
	}
}
