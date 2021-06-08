package com.coding;

public class NumberParser {
	
	private String delimiter;

	public NumberParser() {
		delimiter = "[,\n]";
	}
	
	private String[] splitOnDelimiter(String numbers) {
		
		if(numbers.startsWith("/")) {
			return numbers
					.substring(numbers.indexOf("\n")+1)
					.split(numbers);
		}
		
		return numbers.split(delimiter);
	}
	
}
