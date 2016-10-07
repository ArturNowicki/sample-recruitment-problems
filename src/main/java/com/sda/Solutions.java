package com.sda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solutions {

	public static String capitalizeWord(String string) {
		String result = "";
		if (!string.isEmpty()) {
			String[] words = string.split(" ");
			StringBuilder sb = new StringBuilder();
			char[] letters;
			for (String w : words) {
				letters = w.toCharArray();
				letters[0] = w.toUpperCase().charAt(0);
				sb.append(String.valueOf(letters));
				sb.append(" ");
			}
			result = sb.toString().trim();
		}
		return result;
	}

	public static boolean dividesSelf(int number) {
		boolean isSelfDividing = true;
		String numberAsString = String.valueOf(number);
		if (numberAsString.contains("0"))
			isSelfDividing = false;
		int tmpNumber = number;
		while (tmpNumber > 0 && isSelfDividing) {
			if (number % (tmpNumber % 10) != 0) {
				isSelfDividing = false;
			}
			tmpNumber = tmpNumber / 10;
		}
		return isSelfDividing;
	}

	public static String fizzBuzz(int i) {
		String result = "";
		if (i % 3 == 0)
			result += "Fizz";
		if (i % 5 == 0)
			result += "Buzz";
		return result.isEmpty() ? String.valueOf(i) : result;
	}

	public static int kth(int[] ints, int idx) {
		int length = ints.length;
		int[] numbers = new int[length];
		System.arraycopy(ints, 0, numbers, 0, ints.length);
		Arrays.sort(numbers);
		return numbers[length - idx];
	}

	public static String popularLetter(String string) {
		char[] chars = string.replaceAll(" ", "").toCharArray();
		Map<String, Integer> occurences = new HashMap<String, Integer>();
		for (char letter : chars) {
			String letterAsString = String.valueOf(letter);
			occurences.put(letterAsString, occurences.getOrDefault(letterAsString, 0) + 1);
		}
		Entry<String, Integer> mostPopular = null;
		for (Entry<String, Integer> entry : occurences.entrySet()) {
			if (mostPopular == null || entry.getValue() > mostPopular.getValue()) {
				mostPopular = entry;
			}
		}
		return mostPopular.getKey();
	}

	public static boolean isIncreasing(int[] ints) {
		List<Integer> unsorted = IntStream.of(ints).boxed().collect(Collectors.toList());
		List<Integer> sorted = new ArrayList<>(unsorted);
		Collections.sort(sorted, (e1, e2) -> e1 < e2 ? -1 : 1);
		return unsorted.equals(sorted);
	}

	public static int sumOfPrimes(int i) {
		int result = 0;
		boolean[] mayBePrime = new boolean[i + 1];
		int size = i + 1;
		Arrays.fill(mayBePrime, true);
		for (int j = 2; j < Math.sqrt(size); j++) {
			if (mayBePrime[j]) {
				for (int k = 2 * j; k < size; k += j) {
					mayBePrime[k] = false;
				}
			}
		}
		for (int j = 2; j < size; j++) {
			if (mayBePrime[j]) {
				result += j;
			}
		}
		return result;
	}

}
