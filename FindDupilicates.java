package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDupilicates {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(123, 123, 198, 102, 176, 176);

		List<Integer> duplicateNumbers = numbers.stream()
                .collect(Collectors.groupingBy(i -> i))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("Duplicate numbers: " + duplicateNumbers);
	
	}

}
