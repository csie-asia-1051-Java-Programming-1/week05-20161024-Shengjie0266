package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021040 洪聖傑
 */
import java.util.*;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int [] data=new int [n];
		int a=0,b=0,c=0;
		for(int i=0;i<n;i++){
			data[i]=scn.nextInt();
		}
		for(int j=0;j<n;j++){
			for(int k=0;k<n;k++){
				if(data[k]>a){
					a=data[k];
					c=k;
				}
			}
			b=a;
			data[c]=-1;
			a=0;
			c=0;
			System.out.println(b);
		}
	}

}
