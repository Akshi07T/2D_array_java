import java.util.*;

public class searchKey {
    public static boolean searchkey(int matrix [][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at: (" +i + "," +j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args){
        try (//int[][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in)) {
            int[][] matrix = new int[3][3];
            int key = 5;
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

            searchkey(matrix, key);
        }

    }
}


