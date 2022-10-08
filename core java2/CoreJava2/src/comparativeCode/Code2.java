package comparativeCode;

public class Code2 {
	public static void main(String arr[]) {
		
		// rotation of ABCD =====>CDAB
		//ABCDABCD
		
		String s1="ABCD";
		String s2="CDAB";
		
		if(s1.length()==s2.length()&&(s1+s1).indexOf(s2)!=-1) {
			System.out.println("Rotation");
		}else {
			System.out.println("Sorry");
		}
		
	}

}