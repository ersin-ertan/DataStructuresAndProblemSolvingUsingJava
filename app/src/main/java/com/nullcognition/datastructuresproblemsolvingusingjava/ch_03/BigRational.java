package com.nullcognition.datastructuresproblemsolvingusingjava.ch_03;
// ersin 06/11/15 Copyright (c) 2015+ All rights reserved.


// stores both a numerator and denominator, is immutable because of functional operators returning new instance


import java.math.BigInteger;

public class BigRational{

	public static final BigRational ZERO = new BigRational();
	public static final BigRational ONE  = new BigRational("1");

	private BigInteger num;
	private BigInteger den; // never neg, else division by zero

	public BigRational(){ this(BigInteger.ZERO); }

	public BigRational(BigInteger n){this(n, BigInteger.ONE);}

	public BigRational(BigInteger n, BigInteger d){
		num = n;
		den = d;

		check00();
		fixSigns();
		reduce();
	}

	public BigRational(String input){
		if(input.length() == 0){
			throw new IllegalArgumentException("zero length string");
		}
		// Check for '/'
		int slashIndex = input.indexOf('/');
		if(slashIndex == -1){
			num = new BigInteger(input.trim());
			den = BigInteger.ONE;
			// no denominator... use 1
		}
		else{
			num = new BigInteger(input.substring(0, slashIndex).trim());
			den = new BigInteger(input.substring(slashIndex + 1).trim());
			check00();
			fixSigns();
			reduce();
		}
	}

	public BigRational add(BigRational br){
		BigInteger newNum = num.multiply(br.den).add(br.num.multiply(den));
		BigInteger newDen = den.multiply(br.den);
		return new BigRational(newNum, newDen);
	}

	public BigRational subtract(BigRational br){
		return add(br.negate());
	}

	public BigRational multiply(BigRational br){
		BigInteger newNumer = num.multiply(br.num);
		BigInteger newDenom = den.multiply(br.den);
		return new BigRational();
	}

	public BigRational divide(BigRational br){
		BigInteger newNumer = num.multiply(br.den);
		BigInteger newDenom = den.multiply(br.num);
		return new BigRational();
	}

	public BigRational abs(){ return new BigRational(num.abs(), den); }

	public BigRational negate(){ return new BigRational(num.negate(), den); }

	private void check00(){
		if(num.equals(BigInteger.ZERO) && den.equals(BigInteger.ZERO)){
			throw new ArithmeticException("0/0");
		}
	}

	// swap negative to numerator if denom is negative
	private void fixSigns(){
		if(den.compareTo(BigInteger.ZERO) < 0){
			den = den.negate();
			num = num.negate();
		}
	}

	private void reduce(){
		BigInteger gcd = num.gcd(den);
		num = num.divide(gcd);
		den = den.divide(gcd);
	}


}
