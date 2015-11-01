package com.nullcognition.datastructuresproblemsolvingusingjava;
// ersin 31/10/15 Copyright (c) 2015+ All rights reserved.


import android.util.Log;

//Integer.toString(100,2) // prints 1100100 --binary representation
public class Bitshifting{

	public static final String T     = "Log.wtf";
	//	static int i = 0;
	//	static int i = 1;
	static              String set   = "|1";
	static              String unset = "|0";

	public static void bitshift(int power){
		int num = (int) Math.pow(2, power);

		StringBuilder s = new StringBuilder(set);
		for(int i = num / 2; i > 0; i /= 2){ // the first /2 is for the set location
			s.append(unset);
		}
		Log.wtf(T, s.toString());

		for(int i = 0; i < 5; i++){
			Log.wtf(T, Integer.toBinaryString(num) + "\t>>>\t" + Integer.toString(i) + "\t=\t" + Integer.toBinaryString(num >>> i));
		}

		for(int i = 0; i < 5; i++){
			Log.wtf(T, Integer.toBinaryString(num) + "\t>>\t" + Integer.toString(i) + "\t=\t" + Integer.toBinaryString(num >> i));
		}

		for(int i = 0; i < 5; i++){
			Log.wtf(T, Integer.toBinaryString(num) + "\t<<\t" + Integer.toString(i) + "\t=\t" + Integer.toBinaryString(num << i));
		}
	}

	public static void bitshiftArithmetic(){
		int num = (int) Math.pow(2, 3);

		StringBuilder s = new StringBuilder(set);
		for(int i = num / 2; i > 0; i /= 2){ // the first /2 is for the set location
			s.append(unset);
		}
		num *= -1;
		Log.wtf(T, s.toString());

		for(int i = 0; i < 5; i++){
			Log.wtf(T, Integer.toBinaryString(num) + "\t>>>\t" + Integer.toString(i) + "\t=\t" + Integer.toBinaryString(num >>> i));
		}
		Log.wtf(T, "V.s.\n"+Integer.toBinaryString(num) + "\t>>\t" + Integer.toString(4) + "\t=\t" + Integer.toBinaryString(num >> 4));

	}

	// Since JVM 1.2, intermediate computations are not limited to the standard 32 bit and 64 bit precisions. On platforms that can
	// handle other representations e.g. 80-bit double extended on x86 or x86-64 platforms, those representations can be used, helping to prevent round-off errors and overflows, thereby increasing precision.

	public static strictfp class StrictFloatingPoint{}
}
