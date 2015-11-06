package com.nullcognition.datastructuresproblemsolvingusingjava.ch_02;
// ersin 05/11/15 Copyright (c) 2015+ All rights reserved.


/**
 @author Ersin Ertan */

public class JavadocEx{

	/**
	 @return magic number int
	 */
	public int test(){return 2; }

	/**
	 @param i the example param
	 */
	public void testt(int i){}

	/**
	 @throws NullPointerException for those who need it
	 */
	public void throwing(){ throw new NullPointerException(); }

	// ctrl + -/+ will un/fold the code blocks

	class JavadocReferencingClient{

		int i;

		public void v(){
			testt(3); // ctrl + space the method to see the java doc text

			test();

			throwing(); // even has link to referencing class that can be accessed in the prompt
		}
	}
}
