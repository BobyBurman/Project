package corejava;

public class TreeSet {
    //SORTED SET IN assending order
	public static void main(String arr[]) {
		java.util.TreeSet<Integer> li=new java.util.TreeSet<Integer>();
		li.add(6);
		li.add(45);
		li.add(90);
		li.add(34);
		System.out.println(li);
		li.pollFirst();
		li.pollLast();
		System.out.println(li);
	}
	
}
