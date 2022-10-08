package java8;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//stream is nothing but series of objects. 
//So, when we have a list and we are trying to apply stream on it. it can take one by one all the elements and perform operations.
//It can two type 1. synchronized 2.Parallel
//synchronized: take one after another element form list and perform operations in syn. way
//Parallel : execute in concurrent way and produce result in concurrent way.
//Intermediate: multiple time, return stream object(map,filter,sorted)
//Terminated(terminal): once in code, does not return stream object(for each,collect)

public class StreamApiDriver {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,5,3,4,7,8,5);
		
		//list.stream().map(n-> n*2).forEach(System.out::println);
		
		//list.stream().filter(n->n%2!=0).forEach(System.out::println);
		
		//HashSet<Integer> hp= new HashSet<Integer>();
		
		//list.stream().filter(n->!hp.add(n)).forEach(System.out::println);
		
		int i=list.stream().max((x,y)->x-y).get();
		//System.out.println(i);
		
		int j=list.stream().min((x,y)->x-y).get();
		//System.out.println(j);
		
		//list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
	}

}
