package corejava;

import java.util.Scanner;

public class Basic {
	public static void main(String arr[]) {
		Scanner input=new Scanner(System.in);
		int num1=0;
		int num2=1;
		int num3=0;
		Fibo obj=new Fibo();
		//obj.logic(num1,num2,num3);
		obj.print();
	}
	
}
class Fibo{
	public void logic(int num1, int num2,int num3) {
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=1;i<=18;i++) {
			n3=n1+n2;
			System.out.print(n3+"   ");
			n1=n2;
			n2=n3;
			
			}
		}
	public void print() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print('*' );
			}
			System.out.println("");
		}
	}
}