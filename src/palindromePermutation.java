/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class palindromePermutation {

	/**
	 * @param args
	 */
	/*
	 * Given a string, write a function to check if it is a permutation of a palindrome.
	 * A palindrome is a word or phrase that is the same forwards and backwards.A permutations
	 * is a rearrangements of letters.The palindrome does not need to be limited to just dictionary words.
	 * 
	 * Example:
	 * 
	 * input : Tact Coa
	 * 
	 * output : True (permutations: "taco cat","atco cta")
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strA = "Tact Coa";
		int lenA = strA.length();
		System.out.println(isPalindromeString(strA,lenA));
	}
	/*
	 * 
	 * Following method records the frequency of characters occurance in the form of array
	 * 
	 * Accordin to palindrome the word count should be even and may be there is one odd count
	 * 
	 * of occurance
	 * 
	 * So we finally compare the occurances if there are more than one odd count occurs we will return false
	 * 
	 * other wise true
	 * 
	 *
	 * 
	 * 
	 */
	static boolean isPalindromeString(String strA,int lenA){
		
		int countOdd = 0;
		int[] table = new int[26]; // Max number of alphabets 
		for(char ch : strA.toCharArray()){  
			int x = getCharNumber(ch); // return the ASCII value of character
			if(x != -1){ // space returns -1
				table[x]++; // frequency recording 
				if(table[x] % 2 ==1){
					countOdd++;
				}else{
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}
	public static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
	
}
