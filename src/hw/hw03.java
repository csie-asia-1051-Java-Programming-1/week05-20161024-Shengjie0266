package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個正整數:");
		int n = scn.nextInt();
		int i=1; //次數
		while(Math.pow(n,i)<=10000){
			i++;
		}
		System.out.println(i);
	}

}
