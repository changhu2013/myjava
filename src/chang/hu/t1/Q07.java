package chang.hu.t1;

public class Q07 {

	/**
	 * ��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ� �Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ���������������������Ա������
	 * ����������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] t1 = new String[] { "a", "b", "c" };
		String[] t2 = new String[] { "x", "y", "z" };

		for (int i = 0; i < t1.length; i++) {
			String n1 = t1[i];
			for (int j = 0; j < t2.length; j++) {
				String n2 = t2[j];
				if (n1.equals("a") && n2.equals("x")) {
					continue;
				} else if (n1.equals("c") && (n2.equals("x") || n2.equals("z"))) {
					continue;
				} else {
					System.out.println(n1 + " :  " + n2);
				}
			}
		}
	}
}
