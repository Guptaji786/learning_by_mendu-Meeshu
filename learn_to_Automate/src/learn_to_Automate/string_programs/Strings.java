package learn_to_Automate.string_programs;

public class Strings {

	public static void main(String[] args) {
		// Simple String --> here we add only new word
		String name = "Mayank";
		name = "Hi"+" "+ name;
		System.out.println(name);
		
		
		//stringBuffer = mutable --> we can change in the same onject and also used for multi-threading.
		
		StringBuffer a = new StringBuffer("learn");
		a.append(" java");
		System.out.println(a);  // no new object is created
		
		//stringBuilder is also mutable but it is not thread safe and also it runs fast
		StringBuilder b = new StringBuilder("hii");
		b.append(" Mayank");
		
		
		
		
		
		
		

	}

}
