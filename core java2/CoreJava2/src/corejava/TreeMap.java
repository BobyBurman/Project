package corejava;

import java.util.Map;

public class TreeMap {
	public static void main(String arr[]) {
		Map<Integer,String> map=new java.util.TreeMap<Integer, String>();
		
		map.put(1, "a");
		map.put(4,"b");
		map.put(3, "c");
		map.put(2,"d");
		
		
		System.out.println(map);
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("a"));
		
		System.out.println(map.replace(1,"f"));
		System.out.println(map.put(2,"B"));
		
		System.out.println(((java.util.TreeMap<Integer, String>) map).firstEntry());
		System.out.println(((java.util.TreeMap<Integer, String>) map).lastEntry());
		System.out.println(((java.util.TreeMap<Integer, String>) map).firstKey());
		System.out.println(((java.util.TreeMap<Integer, String>) map).lastKey());
		
		System.out.println(((java.util.TreeMap<Integer, String>) map).pollFirstEntry());
		System.out.println(((java.util.TreeMap<Integer, String>) map).pollLastEntry());
		
		System.out.println(map);
		
		System.out.println("---------------");
		System.out.println(map.get(1));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
	
		
		
	}
}
