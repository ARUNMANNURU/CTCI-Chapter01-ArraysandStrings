/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class ReplaceSpacesWithString {

	/**
	 * @param args
	 */
	/*
	 * Write a method to replace all spaces in a string with %20 you may assume that the string has sufficient
	 * space at end to hold the additional characters,and that you are given the true length of the string
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "Mr John Smith";
		String strB = "%20";
		int len =13;
		int lenA = strA.length();
		int lenB = strB.length();
		System.out.println(replaceSpaces(strA,strB,lenA,lenB));
	}
	/*
	 * 
	 * Using StringBuilder to append by comparing string containing character if
	 * 
	 * it found empty space append string with %20 and increment the index
	 * 
	 * time-complexity O(n)
	 * 
	 * 
	 */
	static StringBuilder replaceSpaces(String strA,String strB,int lenA,int lenB){
		
		StringBuilder sbFinal = new StringBuilder();
		char[] chA = strA.toCharArray();
		for(int i=0; i < lenA; i++){
			if(chA[i] == ' '){
				sbFinal.append(strB);
				i++;
			}
			sbFinal.append(chA[i]);
		}
		return sbFinal;
	}
}
