package chang.hu.t1;

import java.util.ArrayList;
import java.util.List;

public class Q15 {

	/**
	 * ��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "��
	 * ����6=1+2+3.��� �ҳ�1000���ڵ���������
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
				System.out.println("�ҵ�һ������:" + i);
			}
		}
	}
}
