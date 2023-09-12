class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;


        //Optimized

        //In place transpose

        for(int i = 0; i<n-1 ; i++){
            for(int j= i+1; j<n; j++){
                if(i != j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;

                }
                
            }
        }

        //reverse every row

        for(int[] row : matrix){
            int start = 0;
            int end = n-1;

            while(start<=end){
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;
                start++;
                end--;
            }
        }



        //Brute Force

        // int[][] answer = new int[n][n];

        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         answer[j][(n-1)-i] = matrix[i][j];
        //     }
        // }

        // for(int i = 0; i<n; i++){
        //     for(int j =0; j<n; j++){
        //         matrix[i][j] = answer[i][j];
        //     }
        // }


        
        
    }
}
