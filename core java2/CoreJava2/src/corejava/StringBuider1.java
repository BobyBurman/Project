package corejava;

import java.util.UUID;

public class StringBuider1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sp1=new StringBuilder("dghtr");
		sp1.append("boby");
		sp1.append("burman");
		
		System.out.println(sp1);
		
		System.out.println(Math.random());
		
		System.out.println(UUID.randomUUID());
		
		String str="abcd";
		StringBuffer s=new StringBuffer();
		s.append(str);
		System.out.println(s.reverse());
	}

}
