import java.util.Arrays;
import java.util.Hashtable;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class StringPermutations {

	/**
	 * @param args
	 */
	/*
	 * Given two strings , write method to decide if one is a permutation of the other
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "abc";
		String strB = "cdba";
		int lenA = strA.length();
		int lenB = strB.length();
		System.out.println(isPermutation(strA,strB));
	}
	/*
	 * Permutations means rearrangements 
	 * 
	 * so length should be same 
	 * 
	 * so sort the two string and compare them each other
	 * 
	 * time- complexity is order of O(n)
	 * 
	 */
	static boolean isPermutation(String strA,String strB){
		
		char[] chA = strA.toCharArray();
		char[] chB = strB.toCharArray();
		Arrays.sort(chA);
		Arrays.sort(chB);
		return Arrays.equals(chA, chB);
	}
}
