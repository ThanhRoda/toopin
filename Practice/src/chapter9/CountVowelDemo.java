package chapter9;

public class CountVowelDemo {

	public static void main(String[] args) {
		VowelsAndConsonants num = new VowelsAndConsonants("Thanh Ro da");
		System.out.println("Vowel : " + num.getVowel());
		System.out.println("Consonants : " + num.getConsonants());
	}

}
