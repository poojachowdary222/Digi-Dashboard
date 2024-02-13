package com.example.demo;

import java.util.List;

public class FindEvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		numbers.stream()
		.filter(value -> value % 2 == 0)
		.forEach(System.out::println);

	}

}
