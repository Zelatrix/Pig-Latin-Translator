package javapackages;
import java.util.*;

public class pigLatin 
{
	//The string that is to be converted into pig Latin
	private String toPigLatin;
	//The number of characters in the supplied string
	private int index;
	//The last two characters in the provided string
	private String lastTwoChars;
	//The identifier for the individual characters of a word
	private String[] character;
	//The string of consonants preceding the first vowel
	private String consonantString;
	
	public static void main(String[] args) 
	{
		pigLatin p = new pigLatin();
		p.translate();
	}
	
	public void translate()
	{
		//String[] pigLatinArray = new String[index];
		char[] character = new char[]{'a', 'e', 'i', 'o', 'u'};
		
		Scanner sc = new Scanner(System.in);
		toPigLatin = sc.nextLine();
		
		index = toPigLatin.length();
		
		for(int i = 0; i < index; i++)
		{
			for(int j = 0; j < character.length; j++)
			{
				/**
				 * If the word that is passed to the scanner ends in a vowel, then append the 
				 * string "way" to the end of the word and output it to the terminal. 
				 */
				
				if(toPigLatin.charAt(0) == character[j]) //&& toPigLatin.charAt(index) != 'a')
				{
					System.out.println(toPigLatin + "way");
				}
				
				/**
				 * Words that start with a consonant have all consonant letters up to the first 
				 * vowel moved to the end of the word (as opposed to just the first consonant 
				 * letter), and "ay" is appended.
				 */
				if(toPigLatin.charAt(0) != character[j])
				{
					while(toPigLatin.charAt(j) != character[j])
					{
						j++;
					}
						
					lastTwoChars = toPigLatin.substring(index-2);
					System.out.println(lastTwoChars + toPigLatin.substring(0, index-2) + "ay");
				}
			}		break;
		}
	}
}
