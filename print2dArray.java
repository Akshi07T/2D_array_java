import java.util.*;
public class print2dArray {
    public static void main(String[] args){
        //int[][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               matrix[i][j] = sc.nextInt();
            }
           
        
        } 

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
