package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一個正整數:");
		int n = scn.nextInt();
		int sum=0;
		int j=0;
		for(int i=1;sum<=n;i++){
			sum=sum+i;
			j++;
		}
		System.out.println(j-1);
		
	}

}
