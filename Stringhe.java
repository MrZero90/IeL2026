package Stringhe;

public class Main {

	public static void main(String[] args) {
		
//		The Strings are not primitive variables, they are a complex type, they are objects
//		The objects often have methods/functionalities that we can use
		String myName = "Chiara";
		int numberOfLettersInName = myName.length();
		System.out.println("1. My name is " + myName + ". It is composed by " + numberOfLettersInName + " characters");
		
		
		
		
		
//		Strings are objects 0-based
		String courseName = "Tecnico Sviluppo Siti Web";
//		Attention: length counts the characters inside the variable, 
//		including the empty spaces between words are counted
		int numberOfCharacters = courseName.length();
		System.out.println("2. The lenght of '" + courseName + "' is of " + numberOfCharacters + " characters");
		
		
		
		
		
//		I find a character by its position
		char firstLetter = courseName.charAt(0);
		System.out.println("3. In '" + courseName + "', at the first position, you can find the letter " + firstLetter); 
		char lastLetter = courseName.charAt(courseName.length()-1);
		System.out.println("4. In '" + courseName + "', at the last position, you can find the letter " + lastLetter);		
		
		
		
		
		
//		We can check if some characters are contained inside the text
		boolean doesTheTextContainTheWordWeb = courseName.contains("Web");
		System.out.println("5. The sentence '" + courseName + "' contains the word 'Web': " + doesTheTextContainTheWordWeb);
		
		
		
		
		
//		We can check at what point of the text can be found some characters
		int position = courseName.indexOf("Sviluppo");
		System.out.println("6. The word 'Sviluppo' can be found inside the word " + courseName + " starting at position: " + position);
		int positionOfLetterC = courseName.indexOf("c");
		System.out.println("7. La letter 'c' in position number " + positionOfLetterC);
		
		
		
		
		
//		We can cut a string 
		String partialString = courseName.substring(5,10);
		System.out.println("8. Partial string: " + partialString);
		
		
		
		
		
//		We can make sure all the letters are in uppercase
		System.out.println("9. We can make '" + courseName + "all in big letters: " + courseName.toUpperCase());
//		We can make sure all the letters are in lowercase
		System.out.println("10. We can make '" + courseName + "all in small letters: " +courseName.toLowerCase());
		
		
		
		
		
//		We can combine more text together
		String firstPieceOfTheSentence = "Andiamo in";
		String secondPieceOfTheSentence = "Pausa!";
		String fullSentence = firstPieceOfTheSentence.concat(" ").concat(secondPieceOfTheSentence);
		System.out.println("11. " + fullSentence.toUpperCase());
		
		
		
		
		
//		I can create a string using the keyword "new"
		String s1 = new String("Hello, this is a string");
		
		System.out.println("12. " + s1);
		System.out.println("13. " + s1.charAt(2));
		
		
		
		
		
//		We can compare 2 strings to see if they have the same text
		String helloWorld = "Hello world";
		String hello = "Hello";
		boolean doTheyHaveTheSameText = helloWorld.contentEquals(hello); //.equals() compare the content of the variable
		System.out.println("14." + helloWorld + " and " + hello + " contain the same text: " + doTheyHaveTheSameText );
		

	}

}
