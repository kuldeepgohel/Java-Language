public class Array_2d {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(key + " element is found ");
                    return true;
                }
            }
        }
        System.out.println(key + " element is not found ");
        return false;
    }


    public static void printSpiral(int matrix[][]) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {
            //top
            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j] + " ");
            }
            //right
            for (int j = sr + 1; j <= er; j++) {
                System.out.print(matrix[j][ec] + " ");
            }
            //bottom
            for (int j = ec - 1; j >= sc; j--) {
                if (sr == er) {
                    break;
                }
                System.out.print(matrix[er][j] + " ");
            }
            //left
            for (int j = er - 1; j >= sr + 1; j--) {
                if (sc == ec) {
                    break;
                }
                System.out.print(matrix[j][sc] + " ");
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
    }


    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6}, {7, 8, 9}};
        printSpiral(matrix);

//        Scanner sc = new Scanner(System.in);
//        for(int i = 0;i<n ; i++ )
//        {
//            for(int j = 0 ; j<m ; j++)
//            {
//                matrix[i][j] = sc.nextInt();
//
//            }
//        }
//
//        for(int i = 0;i<n ; i++ )
//        {
//            for(int j = 0 ; j<m ; j++)
//            {
//                System.out.print("[");
//                System.out.print(matrix[i][j]);
//                System.out.print("]");
//
//            }
//            System.out.println();
    }
//        search(matrix,10);
}

