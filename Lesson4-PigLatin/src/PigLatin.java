import java.util.Random;
import java.util.Scanner;

public class PigLatin {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's convert a word to Pig Latin...");
		System.out.println("Enter a word to convert.");
		
		Scanner inWord = new Scanner(System.in);
		String wordToConvert = inWord.nextLine();
		
		System.out.println("Converting " + wordToConvert);
		
		
		if (wordToConvert.startsWith("a") || wordToConvert.startsWith("e") || wordToConvert.startsWith("i") || wordToConvert.startsWith("o") || wordToConvert.startsWith("u")) {
			System.out.println(wordToConvert + "ay");
		}
		else {
			convertToPigLatin(wordToConvert);
		};
		
		final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

	}
	
	public static void convertToPigLatin(String inputWord) {
		int len = inputWord.length();
		//System.out.println("There are " + len + " character in " + inputWord);
		
		//string pL = new string("");
		
		for (int i=0; i<len; i++) {
			char positionalCharacter = inputWord.charAt(i);
			//System.out.println(i + " = " + positionalCharacter);
			char characterstart = Character.toLowerCase(inputWord.charAt(0));
			String pL = new String(" ");
			
			char c = Character.toLowerCase(inputWord.charAt(i));
			//System.out.println(c); 
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				String subString1 = inputWord.substring(i);
				String subString2 = inputWord.substring(0,i);
				
				//Not all instances determine "yay"
				switch(characterstart) {				
				case 'y':
				case 'w':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					pL = "ay";
					break;
				default:
						pL = "yay";
						break;
				}
					
						
				System.out.println((subString1+subString2+pL).toLowerCase());
				break;
			};
			//System.out.println("The Pig Latin word for '"+ inputWord + "' is " + );
		};
		
		
	};

}