package chapter9;

public class demo {

	public static void main(String[] args) {
		
		
		StringBuilder s = new StringBuilder("thanh. hello. haha");
		s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
		int position = s.indexOf(". ");
		System.out.println(position);
		while (position != -1)
		{
		  s.setCharAt(position+2,Character.toUpperCase(s.charAt(position+2)));
		  position = s.indexOf(". ", position + 1);
		}
		System.out.println(s);

	}

}
