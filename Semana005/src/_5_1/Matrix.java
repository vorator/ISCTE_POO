package _5_1;

public class Matrix {
	
	private int[][] data;

	public Matrix(int rows,int cols) {
		
		data = new int [rows][cols];
	
		
	}
	
	public Matrix(int num) {
		
		data = new int [num][num];
	
		
	}
	
	 public int getRowCount() {
	        return data.length;
	    }
	 
	 public int getColCount() {
	        return data[0].length;
	    }
	 
	 public int getValueAt(int row, int col) {
	        // Garantir que os índices estejam dentro dos limites da matriz
	        if (row >= 0 && row < getRowCount() && col >= 0 && col < getColCount()) {
	            return data[row][col];
	        } else {
	            throw new IndexOutOfBoundsException("Índices fora dos limites da matriz.");
	        }
	 }
	 
	 public void changeValueAt(int row, int col, int num) {
	        // Garantir que os índices estejam dentro dos limites da matriz
	        if (row >= 0 && row < getRowCount() && col >= 0 && col < getColCount()) {
	          data[row][col] = num;
	        } else {
	            throw new IndexOutOfBoundsException("Índices fora dos limites da matriz.");
	        }
	 }
	 
	 
	 public void multiplyByScalar(int scalar) {
	        for (int i = 0; i < data.length; i++) { // Iterar sobre as linhas
	            for (int j = 0; j < data[i].length; j++) { // Iterar sobre as colunas
	                data[i][j] *= scalar; // Multiplicar o elemento pelo escalar
	            }
	        }
	 }
	 
	 public boolean hasSameSize(Matrix otherMatrix) {
		 
		 return this.data.length == otherMatrix.data.length && this.data[0].length == otherMatrix.data[0].length;
	    
	 }
	 
	 
	 
	 public void printMatrix() {
	        for (int i = 0; i < getRowCount(); i++) {
	            for (int j = 0; j < getColCount(); j++) {
	                System.out.print(data[i][j] + " ");
	            }
	            System.out.println();
	        }
	 }
}

