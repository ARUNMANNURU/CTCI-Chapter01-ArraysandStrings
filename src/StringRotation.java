/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class StringRotation {

	/**
	 * @param args
	 */
	/*'
	 * Given two string find whether string is rotation of another
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "waterbottle";
		String strB = "erbottlewat";
		int lenA = strA.length();
		int lenB = strB.length();
		System.out.println(stringRotation(strA,strB,lenA,lenB));
	}
	static boolean stringRotation(String strA,String strB,int lenA,int lenB){
		
		String strC = strA+strA; // concatenate two string and compare length of sting whether they are equal or not
		
		if(strC.indexOf(strB) != -1 && strA.length() == strB.length()){
			return true;
		}
		return false;
	}
}
