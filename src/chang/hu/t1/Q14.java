package chang.hu.t1;

import java.util.Scanner;

public class Q14 {

	/**
	 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，
	 * 其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
	 * 几个数相加有键盘控制。
	 * @param args
	 */
	public static void main(String[] args){
		
		int a, b, sum = 0;
	
		Scanner s = new Scanner(System.in);
		System.out.println("请输入a值:");
		a = s.nextInt();		
		
		System.out.println("请输入b项数:");
		b = s.nextInt();
		
		int n = a;
		for(int i = 0; i < b; i++){
			sum += n;
			n = n * 10 + a;
		}
		System.out.println("合计为:" + sum);
	}
}
