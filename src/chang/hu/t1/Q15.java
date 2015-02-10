package chang.hu.t1;

import java.util.ArrayList;
import java.util.List;

public class Q15 {

	/**
	 * 题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
	 * 例如6=1+2+3.编程 找出1000以内的所有完数
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		for(int i = 1; i <= 1000; i++){
			int t = 0;
			List temp = new ArrayList();
			for(int j = 1; j < i / 2; j++){
				if(i % j == 0){
					t = t + j;
					temp.add(j);
				}
			}
			if(t == i){
				System.out.println(temp);
				System.out.println("找到一个完数:" + i);
			}
		}
	}
}
