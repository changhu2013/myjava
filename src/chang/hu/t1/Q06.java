package chang.hu.t1;

public class Q06 {
	
	/**
	 * ��Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬
	 * ����񫣬�ֶ����һ�� �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ�
	 * ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�� ��һ����һ��������10
	 * ���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�
	 * @param args
	 */
	public static void main(String[] args){
		
		int count = 1;
		for(int i = 0 ; i < 3; i++){
			count = (count + 1) * 2;
		}
		System.out.println("��ժ�� " + count + "��");
	}
	
}
