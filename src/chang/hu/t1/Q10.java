package chang.hu.t1;

public class Q10 {

	/**
	 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
	 * С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ����
	 * ����������Ϊ����
	 * @param args
	 */
	public static void main(String[] args){
		
		int p1 = 1;
		int p2 = 1;
		int p = 0;
		for(int i = 3; i <=12; i++){
			p = p2;
			p2 = p1 + p2;
			p1 = p;
			
			System.out.println("��" + i + "���µ����Ӷ���Ϊ:" + p2);
		}
	}
}
