package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith1 {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(11,23,31,15,167,123,234,134);
		List<Integer> digits= numbers.stream()
				.filter(num -> String.valueOf(num).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(  digits);
	}

}
