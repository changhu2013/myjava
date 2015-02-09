package chang.hu.t1;

public class Q08 {

	public static void main(String[] args) {
		int h = 7, w = 7;
		for(int i = 1; i <= h ; i ++){
			for(int j = i; j <= w; j++){
				System.out.print("_");
			}
			System.out.println();
		}
	}
}
