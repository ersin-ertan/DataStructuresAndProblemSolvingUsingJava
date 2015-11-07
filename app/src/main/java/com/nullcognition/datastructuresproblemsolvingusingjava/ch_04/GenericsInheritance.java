package com.nullcognition.datastructuresproblemsolvingusingjava.ch_04;
// ersin 06/11/15 Copyright (c) 2015+ All rights reserved.


public class GenericsInheritance<G>{

	interface MyInterface<H>{

		void m1();

		H m2();

	}

	public static <T> T doSome(T thing){ return thing; } // limited to object only methods

	// if not static, and returning method interfaces type
	public <T extends MyInterface<G>> G genericInterfaceParamFromClass00(G interfacesType, T methodCallsType){
		return methodCallsType.m2();
	}

	// if not static, note that the return type is of G which is one of the arguments
	public <T extends MyInterface<G>> G genericInterfaceParamFromClass01(G interfacesType, T methodCallsType){
		return interfacesType;
	}

	// type bounds
	public static <T extends Comparable> int comp00(){return 1;} // naive method

	public static <T extends Comparable<T>> int comp01(){return 0;} // still not good, because generics are covariant which mean our class

	class Can implements Comparable<Can>{

		@Override public int compareTo(final Can another){
			return 0;
		}
	}


	class But extends Can{ } // ends up implementing Comparable<Can>, but not of its own specific But type with Comparable<But> (whoops, unintended pun :)

	// therefore we need to maintain the parent classes type via the super bounds

	public static <T extends Comparable<? super T>> int comp02(){ return 8; } // we need to say T is-a comparable T where T can be a super class of T

	// type erasure - Generic classes(java lang feature) are converted by the compiler to non-generic classes by a process known as type erasure

	// compiler generates raw class with same name as generic class with types params removed, variables are replaced with their bounds, calls
	// to generic methods have erased return types to which they are cast automatically

	// restrictions - primitive types require wrappers, instanceof tests work only with raw types, static contexts cannot refer to classes type,
	// cannot instantiate generic types, cannot create generic arrays

	// dynamic dispatch - not all params and methods are bound at runtime(but these are: final methods, static methods, private methods(implicitly final))
	// the method appropriate for the object is the one that is being operated on, but is not always the best match(java is compiled, thus deduced statically)
	// this is called static overloading, to which the classes type will check which version of the method to use based on the controlling reference
	// looking up the inheritance tree is the dynamic dispatch(done by the vm)

	// so creating an equals(Sometype type) is actually overloading instead of overriding the equals(Object other), where the type remain the same from the
	// parent class *be careful*



}
