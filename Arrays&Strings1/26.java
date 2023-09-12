class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int col0=1;

        for(int i = 0; i< n; i++){
            for(int j = 0; j<m; j ++){
                if(matrix[i][j] == 0){
                    if(j>0){
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }else if(j == 0){
                        col0 =  0;
                    }
                }
            }
        }

        for(int i = 1; i<n; i++){
            for(int j = 1; j<m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0 ){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int i = 0; i<m ; i++){
                matrix[0][i] = 0;
            }
        }

        if(col0 == 0 ){

            for(int i = 0; i<n ; i++){
                matrix[i][0] = 0;
            }

        }




    }
}
    //Better
    //    boolean[] row = new boolean[n];
    //    boolean[] col = new boolean[m];

    //    for(int i = 0; i<n; i++){
    //        for(int j=0; j<m; j++){

    //            if(matrix[i][j] == 0){
    //                row[i]=true;
    //                col[j] = true;
    //            }
    //        }
    //    } 

    //    for(int i = 0; i<n;i++){
    //        for(int j = 0; j<m; j++){
    //            if(row[i] || col[j]){
    //                matrix[i][j] = 0;
    //            }
    //        }
    //    }      
    // }




    //Brute force
    // public static void setZeroes(int[][] matrix) {

    //     int n = matrix.length;
    //     int m = matrix[0].length;

    //     for(int i = 0; i<n; i++){
    //         for(int j = 0; j<m; j++){
    //             if(matrix[i][j] == 0){
    //                 markRow(matrix,i);
    //                 markCol(matrix,j);
    //             }
    //         }
    //     }

    //     for(int i = 0; i<n; i++){
    //         for(int j = 0; j<m ; j++){
    //             if(matrix[i][j] == -1){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }

    // }

    // public static void  markRow(int[][] matrix, int row){

    //     for(int i = 0; i<matrix[0].length; i++){
    //         if(matrix[row][i] != 0){
    //             matrix[row][i] = -1;
    //         }

    //     }
    // }

    // public static void markCol(int[][] matrix, int col){

    //     for(int i = 0; i<matrix.length; i++){
    //         if(matrix[i][col] != 0){
    //             matrix[i][col] = -1;
    //         }

    //     }
    // }
