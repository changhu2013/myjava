package chang.hu.t1;

public class Q12 {

	/**
	 * ��Ŀ����ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ����
	 * ���λ���������͵��ڸ����������磺153��һ�� "ˮ�ɻ��� "����
	 * Ϊ153=1�����η�+5�����η�+3�����η�
	 * @param args
	 */
	public static void main(String[] args){
		
		for(int i = 101; i < 1000; i++){
			int a = i / 100;
			int b = i % 100 / 10;
			int c = i % 10;
			if(a * a * a + b * b * b + c * c * c == i){
				System.out.println("ˮ�ɻ���:" + i);
			}
		}
	}
	
}
