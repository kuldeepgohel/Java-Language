public class searchInSortedMatrix {
    //brute-force approach
//    public static boolean sism(int matrix[][],int key)
//    {
//     for(int i=0;i<matrix.length;i++)
//     {
//         for(int j=0 ; j< matrix[0].length;j++)
//         {
//            if(matrix[i][j]==key){
//                System.out.println("element is found!!");
//                return true;
//            }
//         }
//     }
//        System.out.println("element not found  :( ");
//     return  false;
//    }

    //stairCase Search
    public static boolean sism(int matrix[][],int key)
    {
     int row = matrix.length-1 ,col = 0;
     while (row >=0 && col <= matrix[0].length-1)
     {
         if(matrix[row][col]==key)
         {
             System.out.println("found key in "+row+" row & "+col+" column ");
             return true;
         }
         else if(key < matrix[row][col])
         {
             row--;
         }
         else {
             col++;
         }
     }
        System.out.println("key not found");
     return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        };
        int key=11;
      sism(matrix,key);
//        System.out.println(result);
    }
}
