package chang.hu.t1;

import java.util.Scanner;

public class Q15 {

	/**
	 * ��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "��
	 * ����6=1+2+3.��� �ҳ�1000���ڵ���������
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		for(int i = 1; i <= 100; i++){
			int t = 0;
			for(int j = 1; j < i / 2; j++){
				if(i % j == 0){
					t = t + j;
				}
			}
			if(t == i){
				System.out.println("�ҵ�һ������:" + i);
			}
		}
	}
}
