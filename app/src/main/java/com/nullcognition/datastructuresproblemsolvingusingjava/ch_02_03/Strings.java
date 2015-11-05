package com.nullcognition.datastructuresproblemsolvingusingjava.ch_02_03;
// ersin 04/11/15 Copyright (c) 2015+ All rights reserved.


public class Strings{

	public void parsing(){
		Integer.parseInt("10010");
		Integer.parseInt("0b0010+0128", 0); // - and + are recognized as operators, between 2-36

		// radix - An integer between 2 and 36 that represents the radix (the base in mathematical numeral systems) Javascript description
	}

	private static int parse(String string, int offset, int radix, boolean negative) throws NumberFormatException{
		int max    = Integer.MIN_VALUE / radix;
		int result = 0;
		int length = string.length();
		while(offset < length){
			int digit = Character.digit(string.charAt(offset++), radix);
			if(digit == -1){
				throw invalidInt(string);
			}
			if(max > result){
				throw invalidInt(string);
			}
			int next = result * radix - digit;
			if(next > result){
				throw invalidInt(string);
			}
			result = next;
		}
		if(!negative){
			result = -result;
			if(result < 0){
				throw invalidInt(string);
			}
		}
		return result;
	}

	private static NumberFormatException invalidInt(String s){
		throw new NumberFormatException("Invalid int: \"" + s + "\""); // keep your throws in another method
	}
}
