package chang.hu.t1;

import java.util.Scanner;

public class Q02 {

	/**
	 * 题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%;利润高于10万元，低于20万元时，低于10万元的部分按10%提成
	 * ，高于10万元的部分，可可提成7.5%;20万到40万之间时，高于20万元的部分，可提成5%;40万到60万之间时高于40万元的部分，可提成3%;
	 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润，求应发放奖金总数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double d = s.nextDouble();
		double j = 0;
		System.out.println("输入利润为:" + d);
		if(d <= 10){
			j = d * 0.1;
		}else if(d > 10 && d <= 20){
			j = (d - 10) * 0.075 + 10 * 0.1;
		}
		
		System.out.println("奖金为:" + j);
	}
}
