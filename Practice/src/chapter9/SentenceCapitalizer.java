package chapter9;

public class SentenceCapitalizer {

	public static void main(String[] args) {
		System.out.println(getSentence("hello. my name is Joe. what is your name?"));
	}

	public static String getSentence(String st) {
		StringBuilder s = new StringBuilder(st);
		s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
		int position = s.indexOf(". ");
		while (position != -1) {
			s.setCharAt(position + 2, Character.toUpperCase(s.charAt(position + 2)));
			position = s.indexOf(". ", position + 1);
		}
		return s.toString();
	}

}
