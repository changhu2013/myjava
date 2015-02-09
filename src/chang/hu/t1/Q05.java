package chang.hu.t1;

public class Q05 {

	/**
	 * ¥Ú”°æ≈æ≈≥À∑®±Ì
	 * @param args
	 */
	public static void main(String[] args){
		for(int i = 1; i < 10; i++){
			for(int j = 1; j < 10; j++){
				if(j <= i){
					System.out.print(i + " * " + j + " = " + (i*j) + " ");
				}else {
					System.out.println();
					break;
				}
			}
		}
	}
	
}
