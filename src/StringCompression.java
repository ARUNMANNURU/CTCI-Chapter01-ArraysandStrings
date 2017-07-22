/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbcccc";
		int len = str.length();
		System.out.println(stringCompression(str,len));
	}
	static String stringCompression(String str,int len){
		
		String stringCompress = "";
		int count=0;
		for(int i=0; i < len ;i++){
			count++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
				stringCompress +=""+str.charAt(i)+count;
				count=0;
			}
		}
		return stringCompress.length() < str.length() ? stringCompress : str ;
	}
}
