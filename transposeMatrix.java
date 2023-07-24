public class transposeMatrix {
    public static void printmatrix(int matrix[][]){
        System.out.print("The matrix is : ");
        for(int i =0; i< matrix.length; i++){
            for(int j =0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            
        }
        
        

       
    }
    public static void main(String[] args){
        int row = 2; int col = 3;
        int matrix[][] = {{1 , 2, 3}, {4, 5, 6}};

        //print original matrix
        printmatrix(matrix);

        //transpose the matrix
        int transposearr[][] = new int[col][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transposearr[j][i] = matrix[i][j];
            }
        }
        //print transposed matrix
        printmatrix(transposearr);
    }
}
