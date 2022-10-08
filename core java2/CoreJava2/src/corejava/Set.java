package corejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;  
public class Set {
	public static void main(String arr[]) {
		
		java.util.Set<Double> set1=new HashSet<Double>();
		set1.add(1.1);
		set1.add(2.2);
		set1.add(3.3);
		set1.add(3.3);
		
		System.out.println(set1);
		System.out.println("--------------------");
		
		var set2=new HashSet<Double>();
		set2.add(8.6);
		set2.add(8.7);
		set2.add(8.8);
		set2.add(8.8);
		set2.add(8.9);
		System.out.println(set2);
		System.out.println("--------------------");
		for(double i:set2) {
			System.out.println(i);
		}
		
		Iterator<Double> it= set1.iterator();
		while(it.hasNext()) {
			double i=(double)it.next();
			System.out.print(i);
		}
		System.out.println("\n");
		System.out.println("--------------------");
		//union
		set1.addAll(set2);
		System.out.println(set1);
		//intersection
		set1.retainAll(set2);
		System.out.println(set1);
		
		set1.remove(8.8);
		
		//set to list;
		var list=new LinkedList<Double>();
		
		list.addAll(set1);
		System.out.println(list);
		System.out.println("--------------------");
		
		Iterator it1=list.listIterator(list.size());
		while (it1.hasNext()) {
			System.out.println(it1.next());
			
		}
		
		
		set1.clear();
		System.out.println(set1);
		
	}
}
