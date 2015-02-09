package chang.hu.t1;

public class Q07 {

	/**
	 * 题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人， 乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比
	 * 赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
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
