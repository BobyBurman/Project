package comparativeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Code3 {
	public static void main(String arr[]) {
		
		//List<Integer> num=List.of(10,20,25,27,30);
		//num.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//num.stream().filter(n->n%2!=0).forEach(System.out::println);
		
		List<Integer> num2=Arrays.asList(20,25,10,20,27,25,27,30);
		//HashSet<Integer> hs=new HashSet<Integer>();
		
		//num2.stream().filter(n->hs.add(n)).forEach(System.out::println);
//		System.out.println("-----------------------------------------");
	    //num2.stream().filter(n->!hs.add(n)).forEach(System.out::println);
		
		//num2.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		//Collections.sort(num2);
		//System.out.println(num2);
		num2.stream().sorted().forEach(System.out::println);
		
		
		
	}
}
