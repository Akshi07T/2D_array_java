public class printSum2Row {
    public static void print2ndRowSum(int matrix[][]){
        int sum = 0;
    
        for(int i=1;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==1){
                     sum += matrix[i][j];
                     

                }
               
            }
           
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int matrix[][] =  {{1,4,9},{11,4,3},{2,2,3} };
        print2ndRowSum(matrix);

    }
}
