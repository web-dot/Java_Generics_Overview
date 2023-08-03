package com.lesson.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
		
	/**
	 * -> Generics enable types(classes, interfaces) to be parameters when defining classes
	 * -> Input to formal parameters are values, but input to type parameters are types
	 * 
	 * */
	
	/**
	 * Code that uses generics has many benifits over the code that do not use generics
	 * 
	 * 
	 * -> Stronger type check at compile time
	 * 		A Java compiler applies strong type checking to generic code
	 * 
	 * -> Elimination of casts : 
	 * 		Listing1 and Listing2
	 * 
	 * -> Enabling programmers to implement generic algorithms.
	 * 
	 * */
	
	/**
	 * A generic class is defined in the following format
	 * 
	 * class name<T1, T2, ..., Tn>{}
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		
		//Listing1(below code needs casting without generics)
		List list = new ArrayList();
		list.add("Hello");
		String s = (String)list.get(0);
		
		//Listing2(with generics, casting is not required)
		List<String> list1 = new ArrayList<>();
		list1.add("Hello");
		String s2 = list1.get(0);
		
		
		// Invoking and instantiating a generic type
		// parameterized type
		BoxWithGenerics<Integer> integerBox;
		integerBox = new BoxWithGenerics<>();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
