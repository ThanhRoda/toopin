package chapter9;

public class WordCounter {

	public static void main(String[] args) {
		System.out.println("Number of word: "+counter(" Thanh is a handsome guy "));
	}

	public static int counter(String st) {
		int count = 0;
		for (int i = 0; i < st.length(); i++)
			if (st.charAt(i) == ' ')
				count += 1;
		if (st.charAt(0) == ' ')
			count -= 1;
		if (st.charAt(st.length() - 1) == ' ')
			count -= 1;
		return count + 1;
	}

}
