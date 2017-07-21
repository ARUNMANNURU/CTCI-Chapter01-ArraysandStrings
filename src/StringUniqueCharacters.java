/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class StringUniqueCharacters {

	/**
	 * @param args
	 */
	
	/*
	 *Implement an algorithm to determine if a string has all unique characters.What if you cann't use additional data structure?
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaa";
		int len = str.length();
		System.out.println(isUnique(str,len));
	}
	
	/*
	 * following method for order of O(n)
	 * 
	 */
	static boolean isUnique(String str,int len){
	
		for(int i=0; i < len; ){
			if(str.charAt(0) == str.charAt(++i)){
				return false;
			}else{
				return true;
			}
		}
		return false;
	}
}
