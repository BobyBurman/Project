package corejava;

import java.util.LinkedHashSet;

public class LinkedHasSet {
	public static void main(String arr[]) {
		LinkedHashSet<Character> has=new LinkedHashSet<Character>();
		has.add('a');
		has.add('b');
		has.add('c');
		has.add('d');
		//follow the insertion order
		System.out.println(has);
		
		has.remove('a');
		
		System.out.println(has);
		
	
	}
}
