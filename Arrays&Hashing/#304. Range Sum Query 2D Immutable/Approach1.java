class NumMatrix {

    int prefix[][];

    public NumMatrix(int[][] matrix) {
        prefix = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i==0 && j ==0)   
                    prefix[i][j] = matrix[0][0];
                else if(i==0)   
                    prefix[i][j] = matrix[i][j] + prefix[i][j-1];
                else if(j==0)   
                    prefix[i][j] = matrix[i][j] + prefix[i-1][j];
                else    
                    prefix[i][j] = matrix[i][j] + 
                                    prefix[i-1][j] + 
                                    prefix[i][j-1] - 
                                    prefix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1==0 && col1==0) return prefix[row2][col2];
        else if(row1==0) return prefix[row2][col2] - prefix[row2][col1-1];
        else if(col1==0) return prefix[row2][col2] - prefix[row1-1][col2];
        else return prefix[row2][col2] - prefix[row1-1][col2] - prefix[row2][col1-1] + prefix[row1-1][col1-1];
    }
}
