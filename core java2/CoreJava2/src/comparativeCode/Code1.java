package comparativeCode;

public class Code1 {

	public static void main(String[] args) {
		
		/*
		String str="cloudTech#@$%^&* !";
		
		int i=str.length();
		
		String sp="[^A-Za-z0-9]";
		
		String str2=str.replaceAll(sp,"");
		
		System.out.println("String without special character :"+str2);
		
		System.out.println("Number of special char :"+(i-str2.length()));
		
		System.out.println("Number of char :"+str2.length());
		*/
		
		String str="cloudTech!@#";
		int count=0;
		String str2="";
		
		for(int i=0;i<str.length();i++) {
			
			if(!Character.isDigit(str.charAt(i))&&!Character.isAlphabetic(str.charAt(i))
					&&!Character.isWhitespace(str.charAt(i))){
				
				count++;
				
			}else {
				str2=str2+str.charAt(i);
			}
		}
		
		if(count==0) {
			System.out.println("No special character is present in"+str+" string");
		}else {
			System.out.println("Number of special character is :"+count+
					" and the string without special character is:"+str2);
		}
	}

}
