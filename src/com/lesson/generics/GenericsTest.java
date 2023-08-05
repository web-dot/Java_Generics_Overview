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
	
	/**
	 * Terms:
	 * generic types:
	 * 
	 * type parameters				(class Box<T>{})
	 * generic type - 				generic class or interface parameterized over types
	 * generic class
	 * generic type declaration		(Box<Integer> integerBox;) 
	 * type parameter naming		(E,K,N,T,V)
	 * generic type invocation		(replaces T(parameter) with concrete-value(argument))
	 * type reference 				(Box<Integer> integerBox = new Box<Integer>())
	 * type inference				(Box<Integer> integerBox = new Box<>())
	 * parameterized type as type parameter	(OrderedPair<String, Box<Integer>)
	 * 
	 * generic methods:
	 * public <K, V> double compare(Pair<K, V> p1, Pair<K, V> p2){}
	 * 
	 * bounded type parameters:
	 * public <T extends Number> double sum(T a, T b){return a + b}
	 * class NaturalNumber<T extends Number>{ private T n;}
	 * 
	 * multiple bounds:
	 * <T extends B2 & B2 & B3>
	 * 
	 * */
	
	
	//Bounded type parameters
	public static <U extends Number> void inspect(U u) {
		System.out.println("U: " + u.getClass().getName());
	}
	
	
	
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
		
		
		inspect(7L);
		
	}
	
	
	
	/**
	 * Generic methods and bounded type parameters
	 * */
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for(T e : anArray) {
			if(e.compareTo(elem) > 0) {
				++count;
			}
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
