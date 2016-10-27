package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個正整數:");
		int n = scn.nextInt();
		double sum=0;
		for(double i=1;i<n+1;i+=2){
			sum=sum+1/(i*(i+1));
			
		}
		System.out.println(sum);
	}

}
