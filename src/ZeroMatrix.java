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
	static void zeroMatrix(int[][] zeroMatrix){
		
		boolean[] rowMatrix = new boolean[zeroMatrix.length];
		boolean[] colMatrix = new boolean[zeroMatrix[0].length];
		
		for(int i=0; i < zeroMatrix.length; i++){
			for(int j=0; j < zeroMatrix[0].length; j++){
				if(zeroMatrix[i][j] == 0){
					rowMatrix[i] = true;
					colMatrix[j] = true;
				}
			}
		}
		// identify the row index in matrix to nullify
		for(int i=0; i < zeroMatrix.length; i++){
			if(rowMatrix[i])	
				nullifyRow(zeroMatrix, i);
		}
		// identify the coloumn index in matrix to nullify
		for(int j=0; j < zeroMatrix[0].length; j++){
			if(colMatrix[j])	
				nullifyCol(zeroMatrix,j);
		}
		for(int k=0; k < zeroMatrix.length; k++){
			for(int l=0; l < zeroMatrix[0].length; l++){
				System.out.println(zeroMatrix[k][l]);
			}
		}
	}
	static void nullifyRow(int[][] matrix,int row){
		for(int j=0; j < matrix[0].length; j++){
			matrix[row][j] = 0;
		}
	}
	static void nullifyCol(int[][] matrix,int col){
		for(int i=0; i < matrix.length; i++){
			matrix[i][col] = 0;
		}
	}
	
}
