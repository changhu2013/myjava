package chang.hu.t1;

import java.util.Scanner;

public class Q02 {

	/**
	 * ��Ŀ����ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%;�������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%���
	 * ������10��Ԫ�Ĳ��֣��ɿ����7.5%;20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%;40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%;
	 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱��������Ӧ���Ž�������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double d = s.nextDouble();
		double j = 0;
		System.out.println("��������Ϊ:" + d);
		if(d <= 10){
			j = d * 0.1;
		}else if(d > 10 && d <= 20){
			j = (d - 10) * 0.075 + 10 * 0.1;
		}
		
		System.out.println("����Ϊ:" + j);
	}
}
