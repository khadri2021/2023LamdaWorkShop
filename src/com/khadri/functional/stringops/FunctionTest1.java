package com.khadri.functional.stringops;
import java.util.function.Function;

public class FunctionTest1 {
	public static void main(String[] args) {

		Function<String, String> function1 = t -> t.toUpperCase();
		System.out.println("Given String Converted Into UPPER CASE : " + function1.apply("vikram"));

		Function<String, String> function2 = t -> t.toLowerCase();
		System.out.println("Given String Converted Into lower case : " + function2.apply("JEELAN"));

		Function<String, String> function3 = t -> t.concat(t.substring(0, 1));
		System.out.println("Given String Concat With String Starting Letter : " + function3.apply("Babjan "));

		Function<String, String> function4 = t -> t.replace("a", "A");
		System.out.println("Given String Replace With a->A : " + function4.apply("Hai This is Babjan"));
	}
}