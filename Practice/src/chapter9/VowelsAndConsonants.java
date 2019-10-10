package chapter9;

public class VowelsAndConsonants {
	String st;

	public VowelsAndConsonants(String st) {
		super();
		this.st = st;
	}
	public int getVowel() {
		int count=0;
		String n = this.st.toLowerCase();
		for(int i=0; i< st.length(); i++) {
			if (n.charAt(i) == 'e' ||n.charAt(i) == 'u' || n.charAt(i) == 'o' ||
					n.charAt(i) == 'i' ||n.charAt(i) == 'e' || n.charAt(i) == 'a' )
				count++;
		}
		return count;
	}
	public int getConsonants() {
		int count=0;
		String n = this.st.toLowerCase();
		for(int i=0; i< st.length(); i++) {
			if (n.charAt(i) != 'e' && n.charAt(i) != 'u' && n.charAt(i) != 'o' &&
					n.charAt(i) != 'i' &&n.charAt(i) != 'e' && n.charAt(i) != 'a' && Character.isLetter(n.charAt(i)))
				count++;
		}
		return count;
	}
	
}
