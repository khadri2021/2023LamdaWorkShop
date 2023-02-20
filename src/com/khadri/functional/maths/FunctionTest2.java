package com.khadri.functional.maths;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("The Numbers Which Are Used In Addition : "+list.toString());
		Function<List<Integer>, Integer> fun = list1 -> {
			int sum = 0;
			for (Integer integer : list1) {
				sum = sum + integer;
			}
			return sum;
		};
		int result = fun.apply(list);
		System.out.println("Sum of list values: " + result);
	}
}
