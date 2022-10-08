package java8;



public class LamdaDriver {

	public static void main(String[] args) {
		
		//Old way
		FuntionalInterfaceExpression ex=new FuntionalInterfaceExpression() {
		
			@Override
			public int draw(int width) {
				System.out.println("Width : "+width);
				return width;
			}

		};
		ex.draw(5);
		
		
		//lamda
		
		FuntionalInterfaceExpression lamda=(int width)->{
			System.out.println("Width : "+width);
			return width;
		};
		lamda.draw(5);
	}

}
