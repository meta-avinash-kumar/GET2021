/**
 * @author avinash.kumar_metacu
 *
 */
public class SparseMatrix {

	private final SparseMatrixIndex[] mIndex;
	private final int totalRow, totalCol;
	
	/**
	 * Constructor initializes the Sparse matrix
	 * @param matrix
	 */
	public SparseMatrix(int[][] matrix) {
		totalRow = matrix.length;
		totalCol = matrix[0].length;
		int count = 0,index = 0;
		for (int i = 0; i < totalRow; i++) {
			for (int j = 0; j < totalCol; j++) {
				if(matrix[i][j] !=0){
					count++;
				}
			}
		}
		
		mIndex = new SparseMatrixIndex[count];
		for (int i = 0; i < totalRow; i++) {
			for (int j = 0; j < totalCol; j++) {
				if(matrix[i][j] !=0){
					SparseMatrixIndex smi = new SparseMatrixIndex(i, j, matrix[i][j]);
					mIndex[index++] = smi;
				}
			}
		}
	}
	
	/**
	 * Method to compute transpose of sparse matrix
	 * @return transpose matrix
	 */
	public int[][] transposeMatrix(){
		int[][] transpose = new int[totalRow][totalCol]; 
		for (int i = 0; i < mIndex.length; i++) {
			transpose[mIndex[i].getColIndex()][mIndex[i].getRowIndex()]
					= mIndex[i].getValue();
		}
		return transpose;
	}
	
	/**
	 * Adds two SparseMatrix
	 *  	this + sparseMatrix 
	 * @param sparseMatrix
	 * @return AdditionMatrix
	 * @throws ArithmeticException
	 */
	public int[][] addMatrix(SparseMatrix sparseMatrix) throws ArithmeticException{
		if(this.totalRow != sparseMatrix.totalRow 
				|| this.totalCol != sparseMatrix.totalCol){
			throw new ArithmeticException("Dimension are different");
		}
		int[][] addMat = new int[this.totalRow][this.totalCol];
		//initialise addMat with first matrix values
		for (int i = 0; i < this.mIndex.length; i++) {
			addMat[this.mIndex[i].getRowIndex()][this.mIndex[i].getColIndex()]
					= this.mIndex[i].getValue();
		}
		//add 2nd matrix to addMat
		for (int i = 0; i < sparseMatrix.mIndex.length; i++) {
			addMat[sparseMatrix.mIndex[i].getRowIndex()][sparseMatrix.mIndex[i].getColIndex()]
					+= sparseMatrix.mIndex[i].getValue();
		}
		return addMat;
	}

	/**
	 * Multiply two SparseMatrix
	 * 		this * sparseMatrix 
	 * @param sparseMatrix
	 * @return MultiplicationMatrix
	 * @throws ArithmeticException
	 */
	public int[][] multiplyMatrix(SparseMatrix sparseMatrix) throws ArithmeticException{
		if(this.totalCol != sparseMatrix.totalRow){
			throw new ArithmeticException("Dimension mismatch: this.column != sparsematrix.row");
		}
		int[][] mulMat = new int[this.totalRow][sparseMatrix.totalCol];
		for (int i = 0; i < this.mIndex.length; i++) {
			for (int j = 0; j < sparseMatrix.mIndex.length; j++) {
				if(this.mIndex[i].getColIndex() == sparseMatrix.mIndex[j].getRowIndex())
				mulMat[sparseMatrix.mIndex[j].getRowIndex()][sparseMatrix.mIndex[j].getColIndex()]
						+=this.mIndex[i].getValue() * sparseMatrix.mIndex[j].getValue();
			}
		}
		return mulMat;
	}

	/**
	 * Check whether the sparse matrix is symmetric or not.
	 * @return true if symmetric else false
	 */
	public boolean isSymmetric(){
		for (int i = 0; i < mIndex.length; i++) {
			int j;
			for (j = 0; j < mIndex.length; j++) {
				if((mIndex[i].getRowIndex() == mIndex[j].getColIndex()) &&
						(mIndex[i].getColIndex() == mIndex[j].getRowIndex()) &&
						(mIndex[i].getValue() == mIndex[j].getValue())){
							break;
						}
			}
			if(j == mIndex.length){
				return false;
			}
		}
		return true;
	}
		
}
