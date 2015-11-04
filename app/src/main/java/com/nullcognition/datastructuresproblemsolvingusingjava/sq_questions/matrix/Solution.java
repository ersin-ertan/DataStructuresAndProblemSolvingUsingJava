package com.nullcognition.datastructuresproblemsolvingusingjava.sq_questions.matrix;
// ersin 03/11/15 Copyright (c) 2015+ All rights reserved.


import android.util.Log;

public class Solution{

	public static int[][] test = {
			{ 1, 2 },
			{ 3, 4 },
			{ 5, 6 },
			{ 7, 8 },
	};

	int[][] m = new int[2][3];

	public void print(int[][] matrix){
		for(int i = 0; i < matrix.length; ++i){

			StringBuilder s = new StringBuilder(3);

			for(int n = 0; n < matrix[i].length; n++){
				s. append(matrix[i][n]);
				s.append(',');
			}
			Log.wtf("L", s.toString() );
		}
	}
}
