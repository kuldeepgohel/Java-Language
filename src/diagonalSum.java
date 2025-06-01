public class diagonalSum {

    public static int sumOfDiagonal(int matrix[][]) {
        int sum = 0;
//        //primary diagonal
        //simple approach time complexity = O(n^2)
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j) {
//                    sum += matrix[i][j];
//                } else if (i + j == matrix.length - 1) {
//                    sum += matrix[i][j];
//                }
//            }
//        }
        //better approach time complexity = O(n)
        for (int i=0 ; i<matrix.length ; i++)
        {
            //pd
            sum +=matrix[i][i];
            //sd
            if(i != matrix.length-1-i){
            sum+=matrix[i][matrix.length-1-i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        };
        int result = sumOfDiagonal(matrix);
        System.out.println(result);
    }
}
