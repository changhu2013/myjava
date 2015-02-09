package chang.hu.t1;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		int year, month, day;
		int days = 0;

		Input y = new Input();
		year = y.getValue();
		System.out.println(year);

		Input m = new Input();
		month = m.getValue();
		System.out.println(month);

		Input d = new Input();
		day = d.getValue();
		System.out.println(day);
		
		for(int i = 1; i <= month- 1; i++){
			switch(i){
			case 1 : 
				days += 31;
				break;
			case 2 :
				if((year % 400 == 0 || year % 4 == 0) && year % 100 != 0){
					days += 29;
				}else {
					days += 28;
				}
				break;
			case 3 :
				days += 31;
				break;
			case 4 :
				days += 30;
				break;
			case 5 : 
				days += 31;
				break;
			case 6 : 
				days += 30;
				break;
			case 7 : 
				days += 31;
				break;
			case 8 : 
				days += 31;
				break;
			case 9 : 
				days += 30;
				break;
			case 10 :
				days += 31;
				break;
			case 11 :
				days += 30;
				break;
			case 12 : 
				days += 31;
				break;
			}
		}
		
		days += day;
		
		System.out.println("第" + days + "天");
	}

}

class Input {
	int value = 0;

	public Input() {
		System.out.println("请输入数值:");
		Scanner s = new Scanner(System.in);
		value = s.nextInt();
	}

	public int getValue() {
		return value;
	}
}
