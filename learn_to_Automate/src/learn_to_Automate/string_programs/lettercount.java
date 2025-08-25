package learn_to_Automate.string_programs;


public class lettercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Mayank";
		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			boolean countedBefore = false;  //to count each word in string and put in ch

			for (int j = 0; j < i; j++) {   //check that word is already counted
				if (name.charAt(j) == ch) {
					countedBefore = true;
					break;
				}
			}
			if (countedBefore) {
				continue; 
			}

			int count = 0;
			for (int k = 0; k < name.length(); k++) {
				if (name.charAt(k) == ch) {
					count++;
				}
			}

			System.out.println(ch + " → " + count + "times");

		}

	}

}
