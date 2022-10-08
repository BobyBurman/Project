package comparativeCode;

public class Fibonachi {
	public static void main(String arr[]) {
		int a=0,b=1,sum=0;
		System.out.print(a+" "+b);
		for(int i=0;i<8;i++) {
			
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
	}
}
