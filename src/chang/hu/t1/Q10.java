package chang.hu.t1;

public class Q10 {

	/**
	 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
	 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月
	 * 的兔子总数为多少
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
			
			System.out.println("第" + i + "个月的兔子对数为:" + p2);
		}
	}
}
