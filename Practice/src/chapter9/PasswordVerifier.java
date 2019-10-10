package chapter9;

public class PasswordVerifier {
	public static boolean PwChecking(String st) {
		int countNum = 0;
		int countCap = 0;
		int countLow = 0;
		char[] chars = st.toCharArray();
			for(char c : chars) {
				if (Character.isDigit(c))
					countNum++;
				if (Character.isLowerCase(c))
					countLow++;
				if (Character.isUpperCase(c))
					countCap++;
			}
			
		return (st.length() >=6 && countCap >0 && countLow >0 && countNum >0);
	}
}
