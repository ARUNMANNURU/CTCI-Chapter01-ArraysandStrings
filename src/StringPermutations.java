import java.util.Arrays;
import java.util.HashMap;
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
		
		System.out.println(compare(strA,strB));
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
	
	//create a HashMap containing the frequencys of every character of the String  (runtime O(n) )
	static HashMap<Character, Integer> getFrequencys(String s){
	    HashMap<Character, Integer> map = new HashMap<>();

	    for(int i=0; i<s.length(); i++){
	        //get character at position i
	        char c = s.charAt(i);

	        //get old frequency (edited: if the character is added for the 
	        //first time, the old frequency is 0)
	        int frequency;
	        if(map.containsKey(c)){
	            frequency = map.get(c);
	        }else{
	            frequency = 0;
	        }
	        //increment frequency by 1
	        map.put(c, frequency+1 );
	    }

	    return map;
	}
	//runtime O(3*n) = O(n)
	static boolean compare(String s1, String s2){
	    if(s1.length() != s2.length()){
	        return false;
	    }

	    //runtime O(n)
	    HashMap<Character, Integer> map1 = getFrequencys(s1);
	    HashMap<Character, Integer> map2 = getFrequencys(s2);

	    //Iterate over every character in map1 (every character contained in s1)  (runtime O(n) )
	    for(Character c : map1.keySet()){
	        //if the characters frequencys are different, the strings arent permutations
	        if( map2.get(c) != map1.get(c)){
	            return false;
	        }
	    }

	    //since every character in s1 has the same frequency in s2,
	    //and the number of characters is equal => s2 must be a permutation of s1

	    return true;
	}
	
}
