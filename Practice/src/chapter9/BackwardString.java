package chapter9;

public class BackwardString {

	public static void main(String[] args) {
		String st = new String("ThanhRoda");
		for (int i = (st.length() - 1); i >= 0; i--) {
			System.out.print(st.charAt(i));
		}
	}

}
