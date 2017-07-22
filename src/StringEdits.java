/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class StringEdits {

	/**
	 * @param args
	 */
	/*
	 * one way: there are three types of edits that can be performed on Strings : insert a character,
	 * remove character ,replace character.Given two strings write a function to check if they are 
	 * one edit(or zero edits) away.
	 * 
	 * Example:
	 * 
	 * pale --> ple  --> true -->{insert}
	 * 
	 * pales --> pale --> true -->{remove}
	 *  
	 * pale --> bale --> true -->{replace}
	 * 
	 * pale --> bake --> false -->{no edit}
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strA = "pale";
		String strB = "pal";
		int lenA = strA.length();
		int lenB = strB.length();
		StringEdits strEdit = new StringEdits();
		requiredEdits(strA, strB, lenA, lenB);
	}
	static void requiredEdits(String strA,String strB,int lenA,int lenB){
		if(lenA < lenB){
			insertCharacter(strA,strB,lenA,lenB);
		}
		else if(lenA > lenB){
			removeCharacter(strA,strB,lenA,lenB);
			}
		else if(lenA == lenB){
			replaceCharacter(strA,strB,lenA,lenB);
		}
		
	}
	static boolean insertCharacter(String strA,String strB,int lenA,int lenB){
		char[] chA = strA.toCharArray();
		char[] chB = strB.toCharArray();
		int count = 1;
		for(int i=0; i < strA.length(); i++){
			if(chA[i] != chB[i])
				count++;
		}
		if(count == 1){
			return true;
		}
		return false;
	}
	static boolean removeCharacter(String strA,String strB,int lenA,int lenB){
		char[] chA = strA.toCharArray();
		char[] chB = strB.toCharArray();
		int count =1;
		for(int i=0; i < strA.length(); i++){
			if(chA[i] != chB[i]){
				count++;
			}
			if(count == 1){
				return true;
			}
		}
		return false;
	}
	static boolean replaceCharacter(String strA,String strB,int lenA,int lenB){
		char[] chA = strA.toCharArray();
		char[] chB = strB.toCharArray();
		int count =1;
		for(int i=0; i < strA.length(); i++){
			if(chA[i] != chB[i]){
				count++;
			}
			if(count == 1){
				return true;
			}
		}
		return false;
	}
}
