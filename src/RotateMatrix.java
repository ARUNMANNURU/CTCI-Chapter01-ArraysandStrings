/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class RotateMatrix {

	/**
	 * @param args
	 */
	/*
	 * Given an Image represented by an NXN matrix, where each pixel in the image is 4 bytes write a
	 * method to rotate the image by 90 degrees Can do in place?
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixRotate = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(rotateMatrix(matrixRotate));
	}
	static boolean rotateMatrix(int[][] matrixRotate){
		
		if(matrixRotate.length == 0 || matrixRotate.length != matrixRotate[0].length)
			return false;
		int n = matrixRotate.length;
		for(int layer=0; layer < n/2; layer++){
			int first = layer;
			int last = n - 1 - layer;
			for(int i=first; i < last ; i++ ){
				int offset = i - first;
				int top = matrixRotate[first][i];
				matrixRotate[first][i] = matrixRotate[last - offset][i];
				matrixRotate[last-offset][first] = matrixRotate[last][last-offset];
				matrixRotate[last][last-offset] = matrixRotate[i][last];
				matrixRotate[i][last] = top;
			}
		}
		return true;
	}
}
