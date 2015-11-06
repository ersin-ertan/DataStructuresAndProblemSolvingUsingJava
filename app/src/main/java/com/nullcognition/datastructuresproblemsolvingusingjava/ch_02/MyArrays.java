package com.nullcognition.datastructuresproblemsolvingusingjava.ch_02;
// ersin 05/11/15 Copyright (c) 2015+ All rights reserved.


import java.util.Arrays;

public class MyArrays{

	public void arrays(){

		int[] arrays = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		int[] newArray = Arrays.copyOf(arrays, arrays.length * 2);

		// simple copy without using for loop but with Arrays method
	}
}
