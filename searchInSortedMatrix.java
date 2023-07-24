public class searchInSortedMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while(i < m && j >= 0){
            if(matrix[i][j] == target){
                System.out.println("target found at : (" + i + ", " + j + " )");
                return true;
            }else if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
            
            
        }
        return false;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(searchMatrix(matrix, 10));
        
    }
}
