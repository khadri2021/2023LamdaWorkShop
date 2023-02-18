package com.khadri.functional.java;

import java.util.function.Predicate;

public class PredicateTest3 {
	public static void main(String[] args) {
		Predicate<String> containsJava = t1 -> t1.contains("java");
		Predicate<String> containsSpring = t2 -> t2.contains("spring");
		System.out.println(containsJava.or(containsSpring).test("One of the trending language is java"));
		System.out.println(containsJava.or(containsSpring).test("Spring is framework on top of Core java."));
	}
}
