package corejava;

import java.util.*;
import java.util.Arrays;
public class ArrayList {
	public static void main(String arr[]) {
		List<Integer>list= new java.util.ArrayList<>(Arrays.asList(19,6,7,8));
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.set(0, 6));
		
		System.out.println(list.set(3, 6));
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		//list.remove(0);
		System.out.println(list.remove(0));
		System.out.println(list);
		
		System.out.println(list.contains(2)); 
		
		Iterator ifa=list.listIterator();
		while (ifa.hasNext()) {
			int ia= (int) ifa.next();
			System.out.print(ia);
		}
		System.out.println();
		Object[] s=list.toArray();
		System.out.println(s.getClass().arrayType().isArray());
		
		var list3=new java.util.ArrayList<Integer>(List.of(11,44,22,33,66,55));
		
		list3.addAll(list);
		System.out.println("============================");
		System.out.println(list3);
		list3.sort(null);
		System.out.println(list3);
		System.out.println("============================");
		list3.sort(null);
		
		list.clear();
		//System.out.println(list);
	}
}
