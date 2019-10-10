package chapter9;

public class SumofNumbersString {

	public static void main(String[] args) {
	System.out.println( " Sum : "+ getSum("10,2,3,4") );

	}
	public static int getSum(String st) {
		String[] num = st.split(",");
		int sum =0;
		for(String i : num)
				sum += Integer.parseInt(i);
		return sum;
	}
}
