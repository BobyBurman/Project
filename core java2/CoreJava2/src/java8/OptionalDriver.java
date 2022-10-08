package java8;

import java.util.Optional;

public class OptionalDriver {
	public static void main(String[] args) {
		
		String str="hgfgjks";
		
		Optional<String> optional=Optional.of(str); //incase value should not be null
		//Optional<String> optional=Optional.ofNullable(str);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}else {
			String str1=optional.orElse("default");
			System.out.println("value is not present "+ str1);
		}
		
		
	}
}
