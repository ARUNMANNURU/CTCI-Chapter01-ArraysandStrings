/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class ZeroMatrix {

	/**
	 * @param args
	 */
	/*
	 * 
	 * Writ a algorithm such that if an element in an MXN matrix is 0, its entire row and column are set to 0. 
	 *
	 *  
	 *  0  1  2
	 *  _______    
	 * | 1 2 3 | 0
	 * | 5 6 0 | 1   (2,1) --->  (2,0)(0,1)(1,1)(1,2)
	 * |_______|
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arrayMatrix = new int[][]{{1,2,3},{5,6,0}};
		zeroMatrix(arrayMatrix);
	}
	static int[][] zeroMatrix(int[][] zeroMatrix){
		
		boolean[] row = new boolean[zeroMatrix.length];
		boolean[] col = new boolean[zeroMatrix[0].length];
		
		for(int i=0; i < zeroMatrix.length; i++){
			for(int j=0; j < zeroMatrix[0].length; j++){
				if(zeroMatrix[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		for(int i=0; i < row.length; i++){
			if(row[i]) nullifyRow(zeroMatrix,i);
		}
		for(int j=0; j < col.length; j++){
			if(col[j]) nullifyCol(zeroMatrix,j);
		}
		return zeroMatrix;
	}
	static void nullifyRow(int[][] zeroMatrix,int row){
		for(int j=0; j < zeroMatrix.length; j++){
			zeroMatrix[row][j]=0;
		}
	}
	static void nullifyCol(int[][] zeroMatrix,int col){
		for(int i=0; i < zeroMatrix.length; i++){
			zeroMatrix[i][col] = 0;
		}
	}
}
