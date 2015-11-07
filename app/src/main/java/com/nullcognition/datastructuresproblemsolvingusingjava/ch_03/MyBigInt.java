package com.nullcognition.datastructuresproblemsolvingusingjava.ch_03;
// ersin 05/11/15 Copyright (c) 2015+ All rights reserved.


import java.math.BigInteger;
import java.util.Random;

public class MyBigInt{

	void bigInt(){
		BigInteger b = new BigInteger(3, new Random());
		BigInteger c = new BigInteger(3, 50, new Random()); // tolerated prime uncertainty(though it is not used in the method...), random has case for ignore
		BigInteger d = new BigInteger("-1234"); // setting the signed value of string
		BigInteger e = new BigInteger("101001", 2); // with radix
		BigInteger f = new BigInteger(-1, new byte[]{ 1, 2, 3, 4, 5 }); // sign of -1 for neg, 0, and 1 for pos, magnitude is byte[]
	}

	void bi(){

		BigInteger bi = BigInteger.probablePrime(3, new Random());
		bi = BigInteger.valueOf(183483L);
		bi= BigInteger.TEN;

		bi.bitCount();
		bi.abs();
		bi.bitLength();
		bi.divide(new BigInteger(1, new Random()));


		// many more low level operations

	}

}
