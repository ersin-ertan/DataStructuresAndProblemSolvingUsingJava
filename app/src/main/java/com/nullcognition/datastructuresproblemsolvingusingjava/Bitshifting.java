package com.nullcognition.datastructuresproblemsolvingusingjava;
// ersin 31/10/15 Copyright (c) 2015+ All rights reserved.


import android.util.Log;

public class Bitshifting{

	public static final String T     = "Log.wtf";
	//	static int i = 0;
	//	static int i = 1;
	static              String set   = "|1";
	static              String unset = "|0";

	public static void bitshift(int power){
	int    num   = (int) Math.pow(2, power);

		StringBuilder s = new StringBuilder(set);
		for(int i = num/2; i > 0; i /= 2){ // the first /2 is for the set location
			s.append(unset);
		}
		Log.wtf(T, s.toString());

		for(int i = 0; i < 5; i++){
			Log.wtf(T, String.valueOf(num) + "\t>>>\t" + String.valueOf(i) + "\t=\t" + String.valueOf(num >>> i));
		}

		for(int i = 0; i < 5; i++){
			Log.wtf(T, String.valueOf(num) + "\t>>\t" + String.valueOf(i) + "\t=\t" + String.valueOf(num >> i));
		}

		for(int i = 0; i < 5; i++){
			Log.wtf(T, String.valueOf(num) + "\t<<\t" + String.valueOf(i) + "\t=\t" + String.valueOf(num << i));
		}
	}
}
