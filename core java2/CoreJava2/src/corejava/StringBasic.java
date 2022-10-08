package corejava;

public class StringBasic {
	public static void main(String arr[]) {
		String str1="   jewfkjewfkjewnfjew   ";
		String str2="ewdewfere";
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1.trim().concat(str2));
		
		boolean boo=("True").equalsIgnoreCase(str2);
		System.out.println(boo);
		
		System.out.println(str1.length());
		System.out.println(str1.stripLeading());
		System.out.println(str1.getBytes());
		
		System.out.println("-------------------------------");
		
		
		String n1="true";
		String n2="True";
		
		System.out.println(n1.compareTo(n2));
		System.out.println(n1. compareToIgnoreCase(n2));
		System.out.println("-------------------------------");
		String s="[a-z]{1,}";
		System.out.println(n1.matches(s));
		System.out.println("-------------------------------");
		
		
		String s2="I love jave and love python";
		
		System.out.println(s2.contains("i"));
		System.out.println(s2.toLowerCase().contains("i"));
	
		System.out.println("-------------------------------");
		
		System.out.println(s2.startsWith("i"));
		System.out.println(s2.toLowerCase().startsWith("i"));
		
		System.out.println("-------------------------------");
		
		System.out.println(s2.endsWith("PYTHON"));
		System.out.println(s2.toUpperCase().endsWith("PYTHON"));
		
		System.out.println("-------------------------------");
		
		System.out.println(s2.indexOf("love"));
		System.out.println(s2.indexOf("love", 10));
		
		System.out.println("-------------------------------");
		
		System.out.println(s2.lastIndexOf("love"));
		System.out.println(s2.lastIndexOf("love",2));
		
		System.out.println("-------------------------------");
		
		String rep="ABCD";
		System.out.println(rep.charAt(rep.lastIndexOf("D")));
		System.out.println(rep.charAt(3));
		
		System.out.println("-------------------------------");
		
		//print/replace a string with split()
		String rep1="you_are_too_good?";
		
		String ar[]=rep1.split("_");
		String temp="";
		for(String x:ar) {
			System.out.print(x+" ");
			temp=temp+x+" ";
		}
		System.out.println("\n");
		System.out.println("-------------------------------");
		
		StringBuilder stri=new StringBuilder(temp);
		System.out.println(stri.reverse());
		
		System.out.println("-------------------------------");
		
		System.out.println(ar.length);
		System.out.println(temp);
		
		String temp2="";
		for(int i=0;i<temp.length()-1;i++) {
			temp2=temp.charAt(i)+temp2;
		}
		System.out.println(temp2);
		
		System.out.println("-------------------------------");
		
		
		System.out.println();
		
		String re="A_B_C_D";
		String r="";
		for(int i=0;i<re.length();i++) {
			r=re.charAt(i)+r;
		}
		System.out.println(r);
		
		System.out.println(re.substring(0, 3));
		System.out.println(re.substring(0));
		
		System.out.println("-------------------------------");
		System.out.println();
		
		String a1="Pract123ce makes a man perfect w123th success";
		String a2="123";
		String a3="i";
		
		System.out.println(a1.replace(a2,a3));
		
		System.out.println("-------------------------------");
		
		String a4="#%$@^%^welcome @#$%my #$$%friend";
		String a5="[^A-Za-z0-9]";
		System.out.println(a4.replaceAll(a5,""));
			
		System.out.println("-------------------------------");
		
		int i=100;
		//integer to string
		
		System.out.println(Integer.toString(i));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toOctalString(i));
		
		String nu1="100";
		String b="1100100";
		String h="64";
		String o="144";
		System.out.println("-------------------------------");
		System.out.println(Integer.parseInt(nu1,10));
		System.out.println(Integer.parseInt(b,2));
		System.out.println(Integer.parseInt(h,16));
		System.out.println(Integer.parseInt(o,8));
		
		System.out.println("-------------------------------");
		
		//octal to hexadecimel
		
		String oct="144";
		System.out.println(Integer.toHexString(Integer.parseInt(oct,8)));
	}
	
	
	
}
