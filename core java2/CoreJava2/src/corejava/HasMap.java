package corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//containing datas in key value pair format
public class HasMap {
	public static void main(String arr[]) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(1,"mon");
		map.put(2,"tues");
		map.put(3, "wednessday");
		map.put(4, "thrusday");
		System.out.println(map);
		
		map.put(4,"friday");
		System.out.println(map);
		
		map.remove(4);
		
		//map.remove(1,"mon");
		//map.clear();
		System.out.println(map);
		
		Set<Integer> set1=map.keySet();
		System.out.println(set1);
		
		var set2=map.values();
		
		System.out.println(set2);
		
		Set<Entry<Integer, String>> set3=map.entrySet();
		System.out.println(set3);
		
		
		Map<Integer,String> map2=new HashMap<Integer, String>();
		map2.put(4,"mon");
		map2.put(5,"tues");
		map2.put(6, "wednessday");
		map2.put(7, "wednessday");
		System.out.println("---------------");
		System.out.println(map2.get(7));
		map2.replace(7, "fefef");
		System.out.println(map2);
		System.out.println(map2.get(6));		
		map.putAll(map2);
		System.out.println(map);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		for(Entry<Integer,String> i:map2.entrySet()) {
			System.out.println("------------");
			System.out.println(i);
			System.out.println(i.getKey());
			System.out.println(i.getValue());
			
		}
		Iterator it=map.entrySet().iterator();
		 while(it.hasNext()) {
			 
			 System.out.println((it.next()));
		 }
		
	}
}
