package regular;

public class Quantifiers {
	public static void main(String arr[]) {
		
		//ocuurence of precceding ch 0-more
		String pat1="abc*";
		String str1="abc";
		System.out.println(str1.matches(pat1));
		
		String pat2="abc*";
		String str2="ab";
		System.out.println(str2.matches(pat1));
		
		//ocuurence of precceding ch 0-1
		String pat3="abc?";
		String str3="abc";
		System.out.println(str2.matches(pat1));
		

		String pat4="abc?";
		String str4="ab";
		System.out.println(str4.matches(pat4));
		

		String pat5="abc?";
		String str5="abcc";
		System.out.println(str5.matches(pat5));
		
		//ocuurence of precceding ch 1-more
		String pat6="abc+";
		String str6="abc";
		System.out.println(str6.matches(pat6));
		
		String pat7="abc+";
		String str7="ab";
		System.out.println(str7.matches(pat7));		
		
		String p1="abc(xyz)?";
		String s1="abcxyz";
		System.out.println(s1.matches(p1));
		
		String p2="abc(xyz)+";
		String s2="abcxyzxyzxyzxyz";
		System.out.println(s2.matches(p2));
		
		String p3="abc(xyz)*";
		String s3="abcxyzxyzxyzxyz";
		System.out.println(s3.matches(p3));
		
		
		String p4="abc(xyz)*";
		String s4="abc";
		System.out.println(s4.matches(p4));
		
		

		String p5="abc(xyz){2,6}";
		String s5="abcxyzxyzxyz";
		System.out.println(s5.matches(p5));
		
	}
}
