package regular;

public class Regex1 {

	public static void main(String[] args) {
		
		String str1="+91-9123866264 =+&%$";
		
		String str2=str1.replace("+","").replace("-","").replace("=","").replace("&","").replace("%","").replace("$","").replace(" ","");
		
		System.out.println(str2);
		
		String str11="+91-9123866264 =+&%$";
		
		String ex1="[^A-Za-z0-9]";
		
		String str3=str11.replaceAll(ex1, "");
		System.out.println(str3);

	}

}
