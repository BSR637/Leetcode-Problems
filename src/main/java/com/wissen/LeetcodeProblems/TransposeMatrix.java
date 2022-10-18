package com.wissen.LeetcodeProblems;

public class TransposeMatrix {
	
	public int[][] transpose(int[][] matrix) {
        int numberOfRows = matrix.length, numberOfColumns = matrix[0].length;
        int[][] transposeMatrix = new int[numberOfColumns][numberOfRows];

        for(int row = 0; row < numberOfRows; row++)
        {
            for(int column = 0; column < numberOfColumns ; column++)
            {
                transposeMatrix[column][row] = matrix[row][column];
            }
        }
        return transposeMatrix;        
    }

}
