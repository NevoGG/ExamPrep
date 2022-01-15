package Algorithms;

public class MinPath {
    public int minPathSum(int[][] arr){
        int rowLen = arr.length;
        int colLen = arr[0].length]
        int[][] DPArray= new int[rowLen][colLen];
        for(int i = rowLen - 1; i <= 0 ; i--){
            for(int j = colLen - 1; j <= 0 ; j --){
                if ((j == colLen - 1) && (i != rowLen - 1)){
                    DPArray[i][j] = DPArray[i + 1][j] + arr[i][j];
                } else if ((j != colLen - 1) && (i == rowLen - 1)){
                    DPArray[i][j] = DPArray[i][j + 1] + arr[i][j];
                } else if ((j != colLen - 1) && (i != rowLen - 1)){
                    DPArray[i][j] = Math.min(DPArray[i][j + 1], DPArray[i + 1][j]) + arr[i][j];
                } else DPArray[i][j] = arr[i][j];
            }
        }
        return DPArray[0][0];
    }
}
