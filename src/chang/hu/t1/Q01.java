package chang.hu.t1;

public class Q01 {

	/**
	 * ��Ŀ����1��2��3��4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�� ���Ƕ���
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		for (int x = 1; x < 5; x++) {
			for (int y = 1; y < 5; y++) {
				for (int z = 1; z < 5; z++) {
					if (x != y && y != z && x != z) {
						count++;
						System.out.println(x * 100 + y * 10 + z);
					}
				}
			}
		}
		System.out.println(count);
	}
}
