import java.util.Random;
import java.util.Scanner;

public class PigLatin {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's convert a word to Pig Latin...");
		System.out.println("Enter a word to convert.");
		
		Scanner reader = new Scanner(System.in);
		String wordToConvert = reader.nextLine();
		
		System.out.println("Converting " + wordToConvert);
		convertToPigLatin(wordToConvert);
		
		
		final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

	}
	
	public static void convertToPigLatin(String inputWord) {
		int len = inputWord.length();
		System.out.println("There are " + len + " character in " + inputWord);
		for (int i=0; i<len; i++) {
			char positionalCharacter = inputWord.charAt(i);
			System.out.println(i + " = " + positionalCharacter);
		};
		
		
	};

}
