package _5_1;

public class teste {
	    public static void main(String[] args) {
	        // Criar uma matriz 3x3 toda com zeros
	        MatrixVec matrix1 = new MatrixVec(3);
	        MatrixVec matrix2 = new MatrixVec(3);
	        // Imprimir a matriz inicial (toda de zeros)
	        matrix1.printMatrix();

	         //Definir alguns valores na matriz
	        matrix1.changeValueAt(0, 0, 1);
	        matrix1.changeValueAt(0, 1, 2);
	        matrix1.changeValueAt(0, 2, 3);
	        matrix1.changeValueAt(1, 0, 4);
	        matrix1.changeValueAt(1, 1, 5);
	        matrix1.changeValueAt(1, 2, 6);

	        // Definir alguns valores na matriz2
	        matrix2.changeValueAt(0, 0, 7);
	        matrix2.changeValueAt(0, 1, 8);
	        matrix2.changeValueAt(0, 2, 9);
	        matrix2.changeValueAt(1, 0, 10);
	        matrix2.changeValueAt(1, 1, 11);
	        matrix2.changeValueAt(1, 2, 12);

	        // Imprimir a matriz novamente após definir os valores
	        System.out.println("Matriz1 após definir alguns valores:");
	        matrix1.printMatrix();
	        
	        
	        System.out.println("Matriz2 após definir alguns valores:");
	        matrix2.printMatrix();
	        
//	        // Obter um valor específico
//	        int value = matrix1.getValueAt(1, 1);
//	        System.out.println("Valor na posição (1, 1): " + value);
//	        
//	        matrix1.multiplyByScalar(3);
//	        matrix1.printMatrix();
//	       if( matrix1.hasSameSize(matrix2))
//	    	   System.out.println("true tem");
	       System.out.println("Matriz após somar 1 com 2 e escalar");
	       MatrixVec matrixcliente = sumAndScale(matrix1,matrix2,3);
	       matrixcliente.printMatrix();
	    }
	    
	    public static MatrixVec sumAndScale(MatrixVec a, MatrixVec b, int scalar) {
	        // Verificar se as duas matrizes têm as mesmas dimensões
	        if (!a.hasSameSize(b)) {
	            throw new IllegalArgumentException("As matrizes devem ter as mesmas dimensões.");
	        }

	        // Criar uma nova matriz para armazenar o resultado da soma
	        MatrixVec result = new MatrixVec(a.getRowCount(), a.getColCount());

	        // Somar os elementos das matrizes 'a' e 'b', e multiplicar pelo escalar
	        for (int i = 0; i < a.getRowCount(); i++) {
	            for (int j = 0; j < a.getColCount(); j++) {
	                // Obter os valores das duas matrizes e somá-los
	                int sum = (a.getValueAt(i, j) + b.getValueAt(i, j))*scalar;
	                // Definir o valor na matriz resultante, já 

	                result.changeValueAt(i, j, sum);
	            }
	        }

	        // Retornar a nova matriz resultante
	        return result;
	    }
	    
	

}
