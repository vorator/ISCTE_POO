package _5_1;

public class MatrixVec {


	private int[] data;  // Array unidimensional para armazenar os elementos da matriz
    private int rows;    // Número de linhas da matriz
    private int cols;    // Número de colunas da matriz




	public MatrixVec(int rows,int cols) {

		this.rows = rows; // Inicializa o número de linhas
        this.cols = cols; // Inicializa o número de colunas
        data = new int[rows * cols]; // Cria o array unidimensional com o tamanho total
    }

	public MatrixVec(int num) {

		this.rows = num; // Inicializa o número de linhas
        this.cols = num; // Inicializa o número de colunas
        data = new int[num * num]; // Cria o array unidimensional com o tamanho total
    }

	public int getRowCount() {
		return data.length/cols;
	}

	public int getColCount() {
		return cols;
	}

	public int getValueAt(int row, int col) {
		// Garantir que os índices estejam dentro dos limites da matriz
		//if (row >= 0 && row < getRowCount() && col >= 0 && col < getColCount()) {
			return data[row*cols + col];
		//} else {
			//throw new IndexOutOfBoundsException("Índices fora dos limites da matriz.");
		//}
	}

	public void changeValueAt(int row, int col, int num) {
		// Garantir que os índices estejam dentro dos limites da matriz
		//if (row >= 0 && row < getRowCount() && col >= 0 && col < getColCount()) {
			data[row*cols + col]= num;
		//} else {
			//throw new IndexOutOfBoundsException("Índices fora dos limites da matriz.");
		//}
	}
	

	public void multiplyByScalar(int scalar) {
		for (int i = 0; i < this.getRowCount(); i++) { // Iterar sobre as linhas
			for (int j = 0; j < this.getColCount(); j++) { // Iterar sobre as colunas
				data[i*cols + j] *= scalar; // Multiplicar o elemento pelo escalar
			}
		}
	}

	public boolean hasSameSize(MatrixVec otherMatrix) {

		return this.getRowCount() == otherMatrix.getRowCount()  && this.getColCount() == otherMatrix.getColCount();

	}



	public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i * cols + j] + " "); // Cálculo do índice no array unidimensional
            }
            System.out.println();
        }
    }
}



